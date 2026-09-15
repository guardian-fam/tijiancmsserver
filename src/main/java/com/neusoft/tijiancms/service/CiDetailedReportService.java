package com.neusoft.tijiancms.service;

import com.neusoft.tijiancms.po.CiDetailedReport;
import java.util.List;

public interface CiDetailedReportService {
    public List<CiDetailedReport> listCiDetailedReportByCiId(CiDetailedReport detail);
    public int updateCiDetailedReport(List<CiDetailedReport> list);
    public int removeCiDetailedReportByOrderId(CiDetailedReport detail);
}