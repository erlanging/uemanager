package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysUserLogin;
import university.employment.manager.entity.SysUserLoginExample;

public interface SysUserLoginMapper {
    int countByExample(SysUserLoginExample example);

    int deleteByExample(SysUserLoginExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(SysUserLogin record);

    int insertSelective(SysUserLogin record);

    List<SysUserLogin> selectByExample(SysUserLoginExample example);

    SysUserLogin selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") SysUserLogin record, @Param("example") SysUserLoginExample example);

    int updateByExample(@Param("record") SysUserLogin record, @Param("example") SysUserLoginExample example);

    int updateByPrimaryKeySelective(SysUserLogin record);

    int updateByPrimaryKey(SysUserLogin record);
}