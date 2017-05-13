package university.employment.manager.service.student;

import java.util.Map;

import university.employment.manager.entity.SysStuDangan;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuJianli;

public interface StudentService {
	/**
	 * 获取学生所有信息
	 * @param uid
	 * @return
	 */
	public Map<String, Object> getStuallData(Integer uid);
	
	/**
	 * 保存学生信息
	 * @param stuInfo
	 * @return
	 */
	public Map<String,Object> userSaveBaseInfo(SysStuInfo stuInfo);

	/**
	 * 保存学生档案信息
	 * @param stuDangan
	 * @return
	 */
	public Map<String, Object> saveStuDangan(SysStuDangan stuDangan);

	/**
	 * 保存学生简历
	 * @param stuJianli
	 * @return
	 */
	public Map<String, Object> saveStuJianli(SysStuJianli stuJianli);
}
