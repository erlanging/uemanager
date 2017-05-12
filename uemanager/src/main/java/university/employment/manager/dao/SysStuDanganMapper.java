package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysStuDangan;
import university.employment.manager.entity.SysStuDanganExample;

public interface SysStuDanganMapper {
    int countByExample(SysStuDanganExample example);

    int deleteByExample(SysStuDanganExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(SysStuDangan record);

    int insertSelective(SysStuDangan record);

    List<SysStuDangan> selectByExample(SysStuDanganExample example);

    SysStuDangan selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") SysStuDangan record, @Param("example") SysStuDanganExample example);

    int updateByExample(@Param("record") SysStuDangan record, @Param("example") SysStuDanganExample example);

    int updateByPrimaryKeySelective(SysStuDangan record);

    int updateByPrimaryKey(SysStuDangan record);
}