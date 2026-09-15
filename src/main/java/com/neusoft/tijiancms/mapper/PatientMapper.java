package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PatientMapper {
    //登录
    public Patient getPatientByPhoneByPassword(@Param("patientId") String patientId,@Param("password") String password);
    public Patient getPatientByPhone(@Param("phone") String phone);

    //注册
    public int savePatient(Patient patient);
}
