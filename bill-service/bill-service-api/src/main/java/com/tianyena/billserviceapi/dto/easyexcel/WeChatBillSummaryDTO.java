package com.tianyena.billserviceapi.dto.easyexcel;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cuiwx
 * @version 1.0  2021/8/27
 * @description <p>
 * 账单汇总
 * 微信账单头部:16行信息提取
 * 微信账单明细:17行之后的信息
 * </p>
 */
@Data
public class WeChatBillSummaryDTO {

    @ApiModelProperty("微信昵称")
    private String billOwner;

    @ApiModelProperty("账单起始时间")
    private String billStartTime;

    @ApiModelProperty("账单终止时间")
    private String billEndTime;

    @ApiModelProperty("导出类型")
    private String billExportType;

    @ApiModelProperty("导出时间")
    private String billExportTime;

    @ApiModelProperty("账单总记录数")
    private String billPayTotalNum;

    @ApiModelProperty("账单收入总记录数")
    private String billPayInTotalNum;

    @ApiModelProperty("账单收入总金额")
    private String billPayInTotalAmount;

    @ApiModelProperty("账单支出总记录数")
    private String billPayOutTotalNum;

    @ApiModelProperty("账单支出总金额")
    private String billPayOutTotalAmount;

    @ApiModelProperty("账单中性总记录数")
    private String billPayUnknowTotalNum;

    @ApiModelProperty("账单中性总金额")
    private String getBillPayUnknowTotalAmount;
}
