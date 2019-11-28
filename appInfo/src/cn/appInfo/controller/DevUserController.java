package cn.appInfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appInfo.Service.DevUser.DevUserService;
import cn.appInfo.entity.DevUser;

@Controller
@RequestMapping("dev")
public class DevUserController {
    @Resource
    private DevUserService devUserservice;
	@RequestMapping("/devUserlogin")
	public String Devlogin(String devCode,String devPassword,Model model,HttpSession session,HttpServletRequest request) {
		DevUser devUserSession=devUserservice.DevUserlogin(devCode, devPassword);
		//Object o = request.getSession().getAttribute("session-key");  //获取session值
		System.out.println(devUserSession.getDevName());
		if(devUserSession!=null) {
		   session.setAttribute("devUserSession", devUserSession);
		   return "redirect:../developer/main.jsp";  
		}else {
			model.addAttribute("error", "登录失败");
			return "devlogin";
		}
	}
	
	@RequestMapping("login")
	public String login() {
		return "devlogin";
	}
	
	@RequestMapping("logout")
	public String removeSionandreqDevin(HttpSession session,HttpServletRequest request) {
		session.removeAttribute("devUserSession");
			return "devlogin";
		}
		
	}
	
