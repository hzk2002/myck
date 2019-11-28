package cn.appInfo.Service.DevUser;

import cn.appInfo.entity.DevUser;

public interface DevUserService {
	
	//获取用户名和用户密码查询相应的信息
		public DevUser DevUserlogin(String devCode,String devPassword);
		
}
