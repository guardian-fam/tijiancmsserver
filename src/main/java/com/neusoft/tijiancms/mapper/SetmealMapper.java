package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SetmealMapper {

    @Select("select * from setmeal")
    List<Setmeal> listSetmeal();

    /**
     * 供 OrdersMapper.xml 中的 <association> 嵌套查询调用
     * 这里直接传 Integer smId，单参数且是基本类型，SQL可直接用 #{smId}
     */
    @Select("select * from setmeal where smId = #{smId}")
    Setmeal getSetmealByIdByMapper(Integer smId);
}