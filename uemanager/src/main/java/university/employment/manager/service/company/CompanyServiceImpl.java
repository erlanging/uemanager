package university.employment.manager.service.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import university.employment.manager.dao.SysQiyeInfoMapper;
import university.employment.manager.dao.SysQiyeZhaopinMapper;
import university.employment.manager.dao.SysStuInfoMapper;
import university.employment.manager.dao.SysUserLoginMapper;
import university.employment.manager.entity.SysQiyeInfo;
import university.employment.manager.entity.SysQiyeInfoExample;
import university.employment.manager.entity.SysQiyeZhaopin;
import university.employment.manager.entity.SysQiyeZhaopinExample;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuInfoExample;
import university.employment.manager.entity.SysUserLogin;
import university.employment.manager.tool.constants.Constants;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired 
	private SysQiyeInfoMapper cpinfoMapper;
	@Autowired 
	private SysQiyeZhaopinMapper cpZhaopinMapper;
	@Autowired
	private SysUserLoginMapper userLoginMapper;
	@Autowired
	private SysStuInfoMapper stuInfoMapper;
	@Override
	public Map<String, Object> getCpallData(Integer uid) {
		Map<String, Object> result = new HashMap<>();
		SysUserLogin user = userLoginMapper.selectByPrimaryKey(uid);
		//查询企业基本信息
		SysQiyeInfoExample cpinfoexa = new SysQiyeInfoExample();
		cpinfoexa.createCriteria().andUidEqualTo(uid);
		List<SysQiyeInfo> cpinfolist = cpinfoMapper.selectByExample(cpinfoexa);
		
		if(cpinfolist !=null && !cpinfolist.isEmpty()){
			result.put("cpInfo", cpinfolist.get(0));
		}else{
			result.put("cpInfo", "[]");
		}
		if(cpinfolist.size()>Constants.ZERO){
		//查旬企业招聘信息
		SysQiyeZhaopinExample cpzhaopinexa = new SysQiyeZhaopinExample();
		cpzhaopinexa.createCriteria().andQyidEqualTo(cpinfolist.get(0).getQyid());
		List<SysQiyeZhaopin> cpzhaopinlist = cpZhaopinMapper.selectByExample(cpzhaopinexa);
		
		
		if(cpzhaopinlist!=null){
			if(!cpzhaopinlist.isEmpty()){
				result.put("cpzhaopin", cpzhaopinlist.get(0));
			}else{
				result.put("cpzhaopin", "[]");
			}
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			return result;
		}
		}
		result.put(Constants.CODE, Constants.SUCCESS);
		return result;
	}

	@Override
	public Map<String, Object> saveCpinfo(SysQiyeInfo cpinfo) {
		Map<String, Object> result = new HashMap<String,Object>();
		int backstatus = cpinfoMapper.insertSelective(cpinfo);
		if(backstatus > Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "保存成功！");
			result.put(Constants.DATA, cpinfo);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "保存失败！");
		}
		return result;
	}

	@Override
	public Map<String, Object> saveCpZhaopin(SysQiyeZhaopin cpzhaopin) {
		Map<String, Object> result = new HashMap<String,Object>();
		int backstatus = cpZhaopinMapper.insertSelective(cpzhaopin);
		if(backstatus > Constants.ZERO){
			result.put(Constants.CODE, Constants.SUCCESS);
			result.put(Constants.MSG, "保存成功！");
			result.put(Constants.DATA, cpzhaopin);
		}else{
			result.put(Constants.CODE, Constants.FAIL);
			result.put(Constants.MSG, "保存失败！");
		}
		return result;
	}

	@Override
	public Map<String, Object> searchstus(String stuname, String stuzhuanye) {
		Map<String, Object> result = new HashMap<>();
		SysStuInfoExample stuexa = new SysStuInfoExample();
		SysStuInfoExample.Criteria stucri = stuexa.createCriteria();
		stucri.andNameLike(stuname);
		stucri.andZhuanyeLike(stuzhuanye);
		List<SysStuInfo> stuinfolist =stuInfoMapper.selectByExample(stuexa);
		if(stuinfolist!=null){
			if(stuinfolist.size()>Constants.ZERO){
				result.put(Constants.DATA, stuinfolist);
				result.put(Constants.CODE, Constants.SUCCESS);
			}else{
				result.put(Constants.DATA, "[]");
				result.put(Constants.CODE, Constants.SUCCESS);
			}
		}
		return result ;
	}

	@Override
	public Map<String, Object> searchcompany(String cpname) {
		Map<String, Object> result = new HashMap<>();
		SysQiyeInfoExample cpinfoexa = new SysQiyeInfoExample();
		SysQiyeInfoExample.Criteria cpinfocri = cpinfoexa.createCriteria();
		cpinfocri.andQynameLike(cpname);
		List<SysQiyeInfo> cpinfolist = cpinfoMapper.selectByExample(cpinfoexa );
		if(cpinfolist!=null){
			if(cpinfolist.size()>Constants.ZERO){
				result.put(Constants.DATA, cpinfolist);
				result.put(Constants.CODE, Constants.SUCCESS);
			}else{
				result.put(Constants.DATA, "[]");
				result.put(Constants.CODE, Constants.SUCCESS);
			}
		}
		return result ;
	}

	
	
}
