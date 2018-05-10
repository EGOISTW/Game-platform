package store.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import store.pojo.Gorder;
import store.pojo.GorderExample;

public interface GorderMapper {
    int countByExample(GorderExample example);

    int deleteByExample(GorderExample example);

    int deleteByPrimaryKey(BigDecimal oId);

    int insert(Gorder record);

    int insertSelective(Gorder record);

    List<Gorder> selectByExample(GorderExample example);

    Gorder selectByPrimaryKey(BigDecimal oId);

    int updateByExampleSelective(@Param("record") Gorder record, @Param("example") GorderExample example);

    int updateByExample(@Param("record") Gorder record, @Param("example") GorderExample example);

    int updateByPrimaryKeySelective(Gorder record);

    int updateByPrimaryKey(Gorder record);
}