package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.CiReport;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface CiReportMapper {

    @Select("select * from cireport where orderId = #{orderId}")
    List<CiReport> listCiReport(CiReport ciReport);

    @Insert("insert into cireport(ciId, ciName, orderId) " +
            "select sd.ciId, ci.ciName, #{orderId} " +
            "from setmealdetailed sd join checkitem ci on sd.ciId = ci.ciId " +
            "where sd.smId = #{smId} order by sd.sdId")
    int createReportTemplate(CiReport ciReport);
}