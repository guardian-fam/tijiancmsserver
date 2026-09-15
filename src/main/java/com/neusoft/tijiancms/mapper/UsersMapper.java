package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersMapper {

    /**
     * 供 OrdersMapper.xml 中的 <association> 嵌套查询调用
     */
    @Select("select * from users where userId = #{userId}")
    Users getUsersById(String userId);
}