package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HospitalMapper {

    /**
     * 供 OrdersMapper.xml 中的 <association> 嵌套查询调用
     */
    @Select("select * from hospital where hpId = #{hpId}")
    Hospital getHospitalById(Integer hpId);
}