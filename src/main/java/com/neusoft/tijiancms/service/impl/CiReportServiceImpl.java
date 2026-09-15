package com.neusoft.tijiancms.service.impl;

import com.neusoft.tijiancms.mapper.CiReportMapper;
import com.neusoft.tijiancms.po.CiReport;
import com.neusoft.tijiancms.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiReportServiceImpl implements CiReportService {

    @Autowired
    private CiReportMapper ciReportMapper;

    @Override
    public List<CiReport> listCiReport(CiReport ciReport) {
        return ciReportMapper.listCiReport(ciReport);
    }

    @Override
    public int createReportTemplate(CiReport ciReport) {
        return ciReportMapper.createReportTemplate(ciReport);
    }
}