package com.neusoft.tijiancms.service.impl;

import com.neusoft.tijiancms.mapper.CiDetailedReportMapper;
import com.neusoft.tijiancms.po.CiDetailedReport;
import com.neusoft.tijiancms.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CiDetailedReportServiceImpl implements CiDetailedReportService {

    @Autowired
    private CiDetailedReportMapper ciDetailedReportMapper;

    @Override
    public List<CiDetailedReport> listCiDetailedReportByCiId(CiDetailedReport detail) {
        return ciDetailedReportMapper.listCiDetailedReportByCiId(detail);
    }

    @Override
    @Transactional
    public int updateCiDetailedReport(List<CiDetailedReport> list) {
        int count = 0;
        for (CiDetailedReport detail : list) {
            count += ciDetailedReportMapper.updateCiDetailedReport(detail);
        }
        return count;
    }

    @Override
    public int removeCiDetailedReportByOrderId(CiDetailedReport detail) {
        return ciDetailedReportMapper.removeCiDetailedReportByOrderId(detail);
    }
}