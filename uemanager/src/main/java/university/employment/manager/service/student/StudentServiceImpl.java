package university.employment.manager.service.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import university.employment.manager.dao.SysStuChengjiMapper;
import university.employment.manager.dao.SysStuDanganMapper;
import university.employment.manager.dao.SysStuInfoMapper;
import university.employment.manager.dao.SysStuJianliMapper;
import university.employment.manager.dao.SysUserLoginMapper;
import university.employment.manager.entity.SysStuChengji;
import university.employment.manager.entity.SysStuDangan;
import university.employment.manager.entity.SysStuDanganExample;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuInfoExample;
import university.employment.manager.entity.SysStuJianli;
import university.employment.manager.entity.SysStuJianliExample;
import university.employment.manager.entity.SysUserLogin;
import university.employment.manager.tool.constants.Constants;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private SysStuInfoMapper stuInfoMapper;
	@Autowired
	private SysStuChengjiMapper  stuChengjiMapper;
	@Autowired
	private SysUserLoginMapper userLoginMapper;
	@Autowired
	private SysStuDanganMapper stuDanganMapper;
	@Autowired
	private SysStuJianliMapper stuJianliMapper;
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
		//查询学生简历
		SysStuJianliExample exaJianli = new SysStuJianliExample();
		SysStuJianliExample.Criteria criJianli = exaJianli.createCriteria();
		criJianli.andStuidEqualTo(stuinfolist.get(0).getStuid());
		List<SysStuJianli> stuJianlilist = stuJianliMapper.selectByExample(exaJianli);
		if(stuJianlilist !=null && !stuJianlilist.isEmpty()){
			result.put("stuJianli", stuJianlilist.get(0));
		}else{
			result.put("stuJianli", "[]");
		}
		//查询学生档案
		SysStuDanganExample exaDangan = new SysStuDanganExample();
		exaDangan.createCriteria().andStuidEqualTo(stuinfolist.get(0).getStuid());
		List<SysStuDangan> stuDanganlist = stuDanganMapper.selectByExample(exaDangan);
		if(stuDanganlist !=null && !stuDanganlist.isEmpty()){
			result.put("stuDangan", stuDanganlist.get(0));
		}else{
			result.put("stuDangan", "[]");
		}
		result.put(Constants.CODE, Constants.SUCCESS);
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
			result.put(Constants.MSG, "保存失败！");
		}
		return result;
	}

	/**
	 * 保存学生档案
	 */
	@Override
	public Map<String, Object> saveStuDangan(SysStuDangan stuDangan) {
		Map<String, Object> result = new HashMap<String,Object>();
		int backstatus = stuDanganMapper.insertSelective(stuDangan);
		if(backstatus > Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "保存成功！");
			result.put(Constants.DATA, stuDangan);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "保存失败！");
		}
		return result;
	}
	/**
	 * 保存用户简历
	 */
	@Override
	public Map<String, Object> saveStuJianli(SysStuJianli stuJianli) {
		Map<String, Object> result = new HashMap<String,Object>();
		int backstatus = stuJianliMapper.insertSelective(stuJianli);
		if(backstatus > Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "保存成功！");
			result.put(Constants.DATA, stuJianli);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "保存失败！");
		}
		return result;
	}

	
}
