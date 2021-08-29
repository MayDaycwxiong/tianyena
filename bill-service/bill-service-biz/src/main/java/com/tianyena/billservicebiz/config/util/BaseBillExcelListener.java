package com.tianyena.billservicebiz.config.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.tianyena.billserviceapi.dto.easyexcel.AbstractBaseBillBean;
import com.tianyena.billserviceapi.dto.easyexcel.BillCollectionDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author cuiwx
 * @version 1.0  2021/8/29
 * @description <p>监听器
 */
@Slf4j
public class BaseBillExcelListener extends AnalysisEventListener<AbstractBaseBillBean> {

    private List<String> head = new ArrayList<String>();

    private List<AbstractBaseBillBean> details = new ArrayList<AbstractBaseBillBean>();

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        log.info("头数据:{}", JSON.toJSONString(headMap));
        head.add(headMap.get(0));
    }

    public void invoke(AbstractBaseBillBean data, AnalysisContext context) {
        log.info("读取到一条数据:{}", JSON.toJSONString(data));
        details.add(data);
    }

    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("数据解析完毕....");
    }

    public BillCollectionDTO getEasyExcelResult() {
        return new BillCollectionDTO()
                .setHead(head)
                .setDetailList(details);
    }
}
