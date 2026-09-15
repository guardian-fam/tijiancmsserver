package com.neusoft.tijiancms.controller;

import com.neusoft.tijiancms.po.CiReport;
import com.neusoft.tijiancms.service.CiReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ciReport")
public class CiReportController {

    @Autowired
    private CiReportService ciReportService;

    @RequestMapping("/listCiReport")
    public List<CiReport> listCiReport(@RequestBody CiReport ciReport) {
        return ciReportService.listCiReport(ciReport);
    }

    @RequestMapping("/createReportTemplate")
    public int createReportTemplate(@RequestBody CiReport ciReport) {
        return ciReportService.createReportTemplate(ciReport);
    }
}