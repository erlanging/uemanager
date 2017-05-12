package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysJiuyetongji;
import university.employment.manager.entity.SysJiuyetongjiExample;

public interface SysJiuyetongjiMapper {
    int countByExample(SysJiuyetongjiExample example);

    int deleteByExample(SysJiuyetongjiExample example);

    int deleteByPrimaryKey(Integer tjid);

    int insert(SysJiuyetongji record);

    int insertSelective(SysJiuyetongji record);

    List<SysJiuyetongji> selectByExample(SysJiuyetongjiExample example);

    SysJiuyetongji selectByPrimaryKey(Integer tjid);

    int updateByExampleSelective(@Param("record") SysJiuyetongji record, @Param("example") SysJiuyetongjiExample example);

    int updateByExample(@Param("record") SysJiuyetongji record, @Param("example") SysJiuyetongjiExample example);

    int updateByPrimaryKeySelective(SysJiuyetongji record);

    int updateByPrimaryKey(SysJiuyetongji record);
}