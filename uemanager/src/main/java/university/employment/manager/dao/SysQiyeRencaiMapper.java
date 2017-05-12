package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysQiyeRencai;
import university.employment.manager.entity.SysQiyeRencaiExample;

public interface SysQiyeRencaiMapper {
    int countByExample(SysQiyeRencaiExample example);

    int deleteByExample(SysQiyeRencaiExample example);

    int deleteByPrimaryKey(Integer rcid);

    int insert(SysQiyeRencai record);

    int insertSelective(SysQiyeRencai record);

    List<SysQiyeRencai> selectByExample(SysQiyeRencaiExample example);

    SysQiyeRencai selectByPrimaryKey(Integer rcid);

    int updateByExampleSelective(@Param("record") SysQiyeRencai record, @Param("example") SysQiyeRencaiExample example);

    int updateByExample(@Param("record") SysQiyeRencai record, @Param("example") SysQiyeRencaiExample example);

    int updateByPrimaryKeySelective(SysQiyeRencai record);

    int updateByPrimaryKey(SysQiyeRencai record);
}