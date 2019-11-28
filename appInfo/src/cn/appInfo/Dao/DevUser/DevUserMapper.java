package cn.appInfo.Dao.DevUser;

import org.apache.ibatis.annotations.Param;

import cn.appInfo.entity.DevUser;

public interface DevUserMapper {
     
	//获取用户名和用户密码查询相应的信息
	public DevUser DevUserlogin(@Param("devCode")String devCode,@Param("devPassword")String devPassword);
}
