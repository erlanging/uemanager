package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysStuInfo;
import university.employment.manager.entity.SysStuInfoExample;

public interface SysStuInfoMapper {
    int countByExample(SysStuInfoExample example);

    int deleteByExample(SysStuInfoExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(SysStuInfo record);

    int insertSelective(SysStuInfo record);

    List<SysStuInfo> selectByExample(SysStuInfoExample example);

    SysStuInfo selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") SysStuInfo record, @Param("example") SysStuInfoExample example);

    int updateByExample(@Param("record") SysStuInfo record, @Param("example") SysStuInfoExample example);

    int updateByPrimaryKeySelective(SysStuInfo record);

    int updateByPrimaryKey(SysStuInfo record);
}