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
	private SysUserLoginMapper userLoginMapper;
	@Autowired
	private SysStuInfoMapper stuInfoMapper;
	@Autowired
	private SysStuChengjiMapper  stuChengjiMapper;
	
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

	/**
	 * 保存用户信息
	 */
	@Override
	public Map<String, Object> userSaveBaseInfo(SysStuInfo stuInfo) {
		Map<String, Object> result = new HashMap<String,Object>();
		int backstatus = stuInfoMapper.insertSelective(stuInfo);
		if(backstatus > Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "保存成功！");
			result.put(Constants.DATA, stuInfo);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "注册失败！");
		}
		return result;
	}

	/**
	 * 获取用户全部信息
	 */
	@Override
	public Map<String, Object> getStuallData(Integer uid) {
		Map<String, Object> result = new HashMap<>();
		SysUserLogin user = userLoginMapper.selectByPrimaryKey(uid);
		//查询学生基本信息
		SysStuInfoExample stuinfoexa =new SysStuInfoExample();
		SysStuInfoExample.Criteria  stuinfoCri =  stuinfoexa.createCriteria();
		stuinfoCri.andUidEqualTo(user.getUid());
		List<SysStuInfo > stuinfolist = stuInfoMapper.selectByExample(stuinfoexa );
		
		if(stuinfolist !=null && !stuinfolist.isEmpty()){
			result.put("stuInfo", stuinfolist.get(0));
		}else{
			result.put("stuInfo", "[]");
		}
		//查旬学生成绩信息
		List<SysStuChengji> stuChengjiList = stuChengjiMapper.selectByUid(user.getUid());
		
		if(stuChengjiList!=null){
			if(!stuChengjiList.isEmpty()){
				result.put("chengjilist", stuChengjiList);
			}else{
				result.put("chengjilist", "[]");
			}
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			return result;
		}
		
		result.put(Constants.CODE, Constants.SUCCESS);
		return result;
	}
	
	

}
