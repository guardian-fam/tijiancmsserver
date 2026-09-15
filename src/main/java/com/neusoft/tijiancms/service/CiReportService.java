package com.neusoft.tijiancms.service;

import com.neusoft.tijiancms.po.CiReport;
import java.util.List;

public interface CiReportService {
    public List<CiReport> listCiReport(CiReport ciReport);
    public int createReportTemplate(CiReport ciReport);
}