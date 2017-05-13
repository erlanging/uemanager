package university.employment.manager.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import university.employment.manager.entity.SysStuJianli;
import university.employment.manager.entity.SysStuJianliExample;
import university.employment.manager.entity.SysStuJianliKey;

public interface SysStuJianliMapper {
    int countByExample(SysStuJianliExample example);

    int deleteByExample(SysStuJianliExample example);

    int deleteByPrimaryKey(SysStuJianliKey key);

    int insert(SysStuJianli record);

    int insertSelective(SysStuJianli record);

    List<SysStuJianli> selectByExample(SysStuJianliExample example);

    SysStuJianli selectByPrimaryKey(SysStuJianliKey key);

    int updateByExampleSelective(@Param("record") SysStuJianli record, @Param("example") SysStuJianliExample example);

    int updateByExample(@Param("record") SysStuJianli record, @Param("example") SysStuJianliExample example);

    int updateByPrimaryKeySelective(SysStuJianli record);

    int updateByPrimaryKey(SysStuJianli record);
}