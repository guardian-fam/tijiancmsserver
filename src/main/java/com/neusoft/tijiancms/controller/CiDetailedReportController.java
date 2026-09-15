package com.neusoft.tijiancms.controller;

import com.neusoft.tijiancms.po.CiDetailedReport;
import com.neusoft.tijiancms.service.CiDetailedReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciDetailedReport")
public class CiDetailedReportController {

    @Autowired
    private CiDetailedReportService ciDetailedReportService;

    @RequestMapping("/listCiDetailedReportByCiId")
    public List<CiDetailedReport> listCiDetailedReportByCiId(@RequestBody CiDetailedReport detail) {
        return ciDetailedReportService.listCiDetailedReportByCiId(detail);
    }

    @RequestMapping("/updateCiDetailedReport")
    public int updateCiDetailedReport(@RequestBody List<CiDetailedReport> list) {
        return ciDetailedReportService.updateCiDetailedReport(list);
    }
}