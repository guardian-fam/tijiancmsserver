package com.neusoft.tijiancms.mapper;

import com.neusoft.tijiancms.po.CiDetailedReport;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface CiDetailedReportMapper {

    @Select("select * from cidetailedreport where ciId = #{ciId}")
    List<CiDetailedReport> listCiDetailedReportByCiId(CiDetailedReport detail);

    @Update("update cidetailedreport set value = #{value}, isError = #{isError} where cidrId = #{cidrId}")
    int updateCiDetailedReport(CiDetailedReport detail);

    @Delete("delete from cidetailedreport where orderId = #{orderId}")
    int removeCiDetailedReportByOrderId(CiDetailedReport detail);
}