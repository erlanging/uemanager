package university.employment.manager.service.user;

import java.util.Map;

import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysUserLogin;

public interface UserService {
	
	/**
	 * 用户登录
	 * @return
	 */
	public Map<String,Object> userLogin(SysUserLogin userLogin);
	
	
	/**
	 * 用户注册
	 * @return
	 */
	public Map<String,Object> userRegister(SysUserLogin userLogin);

	
	


	
	
}
