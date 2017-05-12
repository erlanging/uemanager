package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysQiyeInfo;
import university.employment.manager.entity.SysQiyeInfoExample;

public interface SysQiyeInfoMapper {
    int countByExample(SysQiyeInfoExample example);

    int deleteByExample(SysQiyeInfoExample example);

    int deleteByPrimaryKey(Integer qyid);

    int insert(SysQiyeInfo record);

    int insertSelective(SysQiyeInfo record);

    List<SysQiyeInfo> selectByExample(SysQiyeInfoExample example);

    SysQiyeInfo selectByPrimaryKey(Integer qyid);

    int updateByExampleSelective(@Param("record") SysQiyeInfo record, @Param("example") SysQiyeInfoExample example);

    int updateByExample(@Param("record") SysQiyeInfo record, @Param("example") SysQiyeInfoExample example);

    int updateByPrimaryKeySelective(SysQiyeInfo record);

    int updateByPrimaryKey(SysQiyeInfo record);
}