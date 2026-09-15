package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {
	//医生登录（根据编码和密码查询）

	@Select("select * from doctor where docCode = #{docCode} and password = #{password}")
	Doctor getDoctorByCodeByPass(Doctor doctor);
}