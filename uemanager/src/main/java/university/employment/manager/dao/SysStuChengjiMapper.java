package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysStuChengji;
import university.employment.manager.entity.SysStuChengjiExample;

public interface SysStuChengjiMapper {
    int countByExample(SysStuChengjiExample example);

    int deleteByExample(SysStuChengjiExample example);

    int deleteByPrimaryKey(Integer chjid);

    int insert(SysStuChengji record);

    int insertSelective(SysStuChengji record);

    List<SysStuChengji> selectByExample(SysStuChengjiExample example);

    SysStuChengji selectByPrimaryKey(Integer chjid);

    int updateByExampleSelective(@Param("record") SysStuChengji record, @Param("example") SysStuChengjiExample example);

    int updateByExample(@Param("record") SysStuChengji record, @Param("example") SysStuChengjiExample example);

    int updateByPrimaryKeySelective(SysStuChengji record);

    int updateByPrimaryKey(SysStuChengji record);
    
	/**
	 * 根据用户ID查找学生成绩
	 * @param uid
	 * @return
	 */
	List<SysStuChengji> selectByUid(Integer uid);
}