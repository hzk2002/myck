package cn.appInfo.Service.DevUser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appInfo.Dao.DevUser.DevUserMapper;
import cn.appInfo.entity.DevUser;
@Service
public class DevUserServiceimpl implements DevUserService{
    @Resource
    private DevUserMapper devUsermapper;
	
	@Override
	public DevUser DevUserlogin(String devCode, String devPassword) {
		return devUsermapper.DevUserlogin(devCode, devPassword);
	}
	
}
