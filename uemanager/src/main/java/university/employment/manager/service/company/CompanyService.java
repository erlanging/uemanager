package university.employment.manager.service.company;

import java.util.List;
import java.util.Map;

import university.employment.manager.entity.SysQiyeInfo;
import university.employment.manager.entity.SysQiyeZhaopin;

public interface CompanyService {

	/**
	 * 获取企业信息
	 * @param uid
	 * @return
	 */
	Map<String, Object> getCpallData(Integer uid);

	/**
	 * 保存企业信息
	 * @param cpinfo
	 * @return
	 */
	Map<String, Object> saveCpinfo(SysQiyeInfo cpinfo);

	/**
	 * 保存企业招聘信息
	 * @param cpzhaopin
	 * @return
	 */
	Map<String, Object> saveCpZhaopin(SysQiyeZhaopin cpzhaopin);

	/**获取学生信息
	 * @param stuname
	 * @param stuzhuanye
	 * @return
	 */
	Map<String, Object> searchstus(String stuname, String stuzhuanye);

	/**
	 * 获取企业信息
	 * @param cpname
	 * @return
	 */
	Map<String, Object> searchcompany(String cpname);
	
}
