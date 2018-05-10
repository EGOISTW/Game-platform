package store.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import store.pojo.Gameuser;
import store.pojo.GameuserExample;

public interface GameuserMapper {
    int countByExample(GameuserExample example);

    int deleteByExample(GameuserExample example);

    int deleteByPrimaryKey(BigDecimal uId);

    int insert(Gameuser record);

    int insertSelective(Gameuser record);

    List<Gameuser> selectByExample(GameuserExample example);

    Gameuser selectByPrimaryKey(BigDecimal uId);

    int updateByExampleSelective(@Param("record") Gameuser record, @Param("example") GameuserExample example);

    int updateByExample(@Param("record") Gameuser record, @Param("example") GameuserExample example);

    int updateByPrimaryKeySelective(Gameuser record);

    int updateByPrimaryKey(Gameuser record);
}