package store.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import store.pojo.Gameinfo;
import store.pojo.GameinfoExample;

public interface GameinfoMapper {
    int countByExample(GameinfoExample example);

    int deleteByExample(GameinfoExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(Gameinfo record);

    int insertSelective(Gameinfo record);

    List<Gameinfo> selectByExample(GameinfoExample example);

    Gameinfo selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") Gameinfo record, @Param("example") GameinfoExample example);

    int updateByExample(@Param("record") Gameinfo record, @Param("example") GameinfoExample example);

    int updateByPrimaryKeySelective(Gameinfo record);

    int updateByPrimaryKey(Gameinfo record);
}