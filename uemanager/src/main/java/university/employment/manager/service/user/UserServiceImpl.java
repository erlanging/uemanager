package university.employment.manager.service.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import university.employment.manager.dao.SysStuChengjiMapper;
import university.employment.manager.dao.SysStuInfoMapper;
import university.employment.manager.dao.SysUserLoginMapper;
import university.employment.manager.entity.SysStuChengji;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuInfoExample;
import university.employment.manager.entity.SysUserLogin;
import university.employment.manager.entity.SysUserLoginExample;
import university.employment.manager.tool.Md5;
import university.employment.manager.tool.constants.Constants;
/**
 * 用户相关操作的实现类
 * @author liang
 *
 */
/**
 * @author liang
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private SysStuInfoMapper stuInfoMapper;
	@Autowired
	private SysStuChengjiMapper  stuChengjiMapper;
	@Autowired
	private SysUserLoginMapper userLoginMapper;

	/**
	 * 用户登录接口
	 */
	@Override
	public Map<String, Object> userLogin(SysUserLogin userLogin) {
		Map<String, Object> result = new HashMap<>();
		SysUserLoginExample example = new SysUserLoginExample();
		example.or().andUsernameEqualTo(userLogin.getUsername());
		List<SysUserLogin> userLoginlists = userLoginMapper.selectByExample(example);
		if(userLoginlists.isEmpty()){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "用户不存在！");
			return result;
		}else{
			SysUserLogin user = userLoginlists.get(0);
			String password = userLogin.getPassword();
			password = Md5.getMd5(password);
			if(password.equalsIgnoreCase(user.getPassword())){
				result.put(Constants.CODE, Constants.SUCCESS);
				result.put(Constants.MSG, "登录成功！");
				user.setPassword("");
				result.put(Constants.DATA, user);
				return result;
			}else{
				result.put(Constants.CODE, Constants.FAIL);
				result.put(Constants.MSG, "密码错误！");
				return result;
			}
		}
	}

	/**
	 * 用户注册
	 */
	@Override
	public Map<String, Object> userRegister(SysUserLogin userLogin) {
		Map<String, Object> result = new HashMap<String,Object>();
		//验证用户名是否重复
		SysUserLoginExample example = new SysUserLoginExample();
		example.or().andUsernameEqualTo(userLogin.getUsername());
		List<SysUserLogin> userLoginlists = userLoginMapper.selectByExample(example);
		
		if(userLoginlists!=null && userLoginlists.size() > Constants.ZERO){
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "用户名已经存在！");
			return result;
		}
		if(userLoginMapper.insertSelective(userLogin) >Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "注册成功！");
			userLogin.setPassword("");
			result.put(Constants.DATA, userLogin);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "注册失败！");
		}
		return result;
	}

	
}
