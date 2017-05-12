package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysStuQiuzhi;
import university.employment.manager.entity.SysStuQiuzhiExample;

public interface SysStuQiuzhiMapper {
    int countByExample(SysStuQiuzhiExample example);

    int deleteByExample(SysStuQiuzhiExample example);

    int deleteByPrimaryKey(Integer qzid);

    int insert(SysStuQiuzhi record);

    int insertSelective(SysStuQiuzhi record);

    List<SysStuQiuzhi> selectByExample(SysStuQiuzhiExample example);

    SysStuQiuzhi selectByPrimaryKey(Integer qzid);

    int updateByExampleSelective(@Param("record") SysStuQiuzhi record, @Param("example") SysStuQiuzhiExample example);

    int updateByExample(@Param("record") SysStuQiuzhi record, @Param("example") SysStuQiuzhiExample example);

    int updateByPrimaryKeySelective(SysStuQiuzhi record);

    int updateByPrimaryKey(SysStuQiuzhi record);
}