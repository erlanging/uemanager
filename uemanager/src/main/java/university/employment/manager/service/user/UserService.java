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

	
	/**
	 * 保存用户信息
	 * @param stuInfo
	 * @return
	 */
	public Map<String,Object> userSaveBaseInfo(SysStuInfo stuInfo);


	/**
	 * 获取用户所有信息
	 * @param uid
	 * @return
	 */
	public Map<String, Object> getStuallData(Integer uid);
	
}
