package com.tianyena.billserviceapi.dto.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description     微信账单对象
 * <p>
 *     微信账单明细对象
 * </p>
 * @author cuiwx
 * @version 1.0  2021/8/27
 */
@Data
public class WeChatBillDTO {

    @ApiModelProperty(value="交易时间",required = true)
    @ExcelProperty(index = 0)
    private Date transTime;

    @ApiModelProperty(value="交易类型",required = true)
    @ExcelProperty(index = 1)
    private String transType;

    @ApiModelProperty(value="交易双方",required = true)
    @ExcelProperty(index = 2)
    private String transPartner;

    @ApiModelProperty(value="商品",required = true)
    @ExcelProperty(index = 3)
    private String transGoods;

    @ApiModelProperty(value="收/支",required = true)
    @ExcelProperty(index = 4)
    private String transDirection;

    @ApiModelProperty(value="金额(元)",required = true)
    @ExcelProperty(index = 5)
    private String transAmount;

    @ApiModelProperty(value="支付方式",required = true)
    @ExcelProperty(index = 6)
    private String payType;

    @ApiModelProperty(value="当前状态",required = true)
    @ExcelProperty(index = 7)
    private String transStatus;

    @ApiModelProperty(value="交易单号",required = true)
    @ExcelProperty(index = 8)
    private String transNo;

    @ApiModelProperty(value="商户单号",required = true)
    @ExcelProperty(index = 9)
    private String businesNo;

    @ApiModelProperty(value="备注",required = true)
    @ExcelProperty(index = 10)
    private String transMemo;
}
