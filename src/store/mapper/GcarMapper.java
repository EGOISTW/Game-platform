package store.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import store.pojo.Gcar;
import store.pojo.GcarExample;

public interface GcarMapper {
    int countByExample(GcarExample example);

    int deleteByExample(GcarExample example);

    int deleteByPrimaryKey(BigDecimal cId);

    int insert(Gcar record);

    int insertSelective(Gcar record);

    List<Gcar> selectByExample(GcarExample example);

    Gcar selectByPrimaryKey(BigDecimal cId);

    int updateByExampleSelective(@Param("record") Gcar record, @Param("example") GcarExample example);

    int updateByExample(@Param("record") Gcar record, @Param("example") GcarExample example);

    int updateByPrimaryKeySelective(Gcar record);

    int updateByPrimaryKey(Gcar record);
}