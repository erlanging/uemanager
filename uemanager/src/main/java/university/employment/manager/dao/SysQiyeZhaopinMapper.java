package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysQiyeZhaopin;
import university.employment.manager.entity.SysQiyeZhaopinExample;

public interface SysQiyeZhaopinMapper {
    int countByExample(SysQiyeZhaopinExample example);

    int deleteByExample(SysQiyeZhaopinExample example);

    int deleteByPrimaryKey(Integer zpid);

    int insert(SysQiyeZhaopin record);

    int insertSelective(SysQiyeZhaopin record);

    List<SysQiyeZhaopin> selectByExample(SysQiyeZhaopinExample example);

    SysQiyeZhaopin selectByPrimaryKey(Integer zpid);

    int updateByExampleSelective(@Param("record") SysQiyeZhaopin record, @Param("example") SysQiyeZhaopinExample example);

    int updateByExample(@Param("record") SysQiyeZhaopin record, @Param("example") SysQiyeZhaopinExample example);

    int updateByPrimaryKeySelective(SysQiyeZhaopin record);

    int updateByPrimaryKey(SysQiyeZhaopin record);
}