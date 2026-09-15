package com.neusoft.tijiancms.service;

import com.neusoft.tijiancms.po.OverallResult;
import java.util.List;

public interface OverallResultService {
    public List<OverallResult> listOverallResultByOrderId(OverallResult overallResult);
    public int saveOverallResult(OverallResult overallResult);
    public int updateOverallResult(OverallResult overallResult);
    public int removeOverallResult(OverallResult overallResult);
}