package com.tianyena.billservicebiz.config.util;

import com.alibaba.excel.EasyExcel;
import com.tianyena.billserviceapi.dto.easyexcel.AbstractBaseBillBean;
import com.tianyena.billserviceapi.dto.easyexcel.BillCollectionDTO;

/**
 * @author cuiwx
 * @version 1.0  2021/8/28
 * @description <p> excel 工具类[https://www.yuque.com/easyexcel/doc/easyexcel]
 */
public class EasyExcelUtil {

    public static BillCollectionDTO readExcel(AbstractBaseBillBean abstractBean,String filePath) {
        BaseBillExcelListener listener = new BaseBillExcelListener();
        EasyExcel.read(filePath, abstractBean.getTargetClazz(), listener)
                .sheet()
                .headRowNumber(abstractBean.getHeadRowNumber())
                .doRead();
        return listener.getEasyExcelResult();
    }
}
