package com.tianyena.billserviceapi.dto.easyexcel;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author cuiwx
 * @version 1.0  2021/8/29
 * @description
 */
@Data
@Accessors(chain = true)
public class BillCollectionDTO {

    private List<AbstractBaseBillBean> detailList;

    private List<String> head;
}
