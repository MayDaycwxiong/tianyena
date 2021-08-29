package com.tianyena.billserviceapi.dto.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author cuiwx
 * @version 1.0  2021/8/28
 * @description <p>
 * 支付宝账单明细对象
 * line1:支付宝交易记录明细查询
 * line2:账号:[13588453892]
 * line3:起始日期[1996-10-22 00:00:00] 终止日期:[2021-08-01 00:00:00]
 * line4:----------------------交易记录明细列表--------------------
 * lien5:
 * linen:
 * </p>
 */
@Data
public class AlipayBillDTO extends AbstractBaseBillBean {

    @ApiModelProperty(value = "交易号", required = true)
    @ExcelProperty(index = 0)
    private String transNo;

    @ApiModelProperty(value = "商户订单号", required = true)
    @ExcelProperty(index = 1)
    private String businessNo;

    @ApiModelProperty(value = "交易创建时间", required = true)
    @ExcelProperty(index = 2)
    private String billCreateTime;

    @ApiModelProperty(value = "付款时间", required = true)
    @ExcelProperty(index = 3)
    private String transTime;

    @ApiModelProperty(value = "最近修改时间", required = true)
    @ExcelProperty(index = 4)
    private String billModifyTime;

    @ApiModelProperty(value = "交易来源地", required = true)
    @ExcelProperty(index = 5)
    private String transLocationResource;

    @ApiModelProperty(value = "类型", required = true)
    @ExcelProperty(index = 6)
    private String transType;

    @ApiModelProperty(value = "交易对方", required = true)
    @ExcelProperty(index = 7)
    private String transPartner;

    @ApiModelProperty(value = "商品", required = true)
    @ExcelProperty(index = 8)
    private String transGoods;

    @ApiModelProperty(value = "金额(元)", required = true)
    @ExcelProperty(index = 9)
    private String transAmount;

    @ApiModelProperty(value = "收/支", required = true)
    @ExcelProperty(index = 10)
    private String transDirection;

    @ApiModelProperty(value = "交易状态", required = true)
    @ExcelProperty(index = 11)
    private String transStatus;

    @ApiModelProperty(value = "服务费(元)", required = true)
    @ExcelProperty(index = 12)
    private String serviceAmount;

    @ApiModelProperty(value = "成功退款(元)", required = true)
    @ExcelProperty(index = 13)
    private String refundAmount;

    @ApiModelProperty(value = "备注", required = true)
    @ExcelProperty(index = 14)
    private String transMemo;

    @ApiModelProperty(value = "资金状态", required = true)
    @ExcelProperty(index = 15)
    private String moneyStatus;

    @Override
    public Class getTargetClazz() {
        return this.getClass();
    }

    @Override
    public Integer getHeadRowNumber() {
        return 5;
    }
}
