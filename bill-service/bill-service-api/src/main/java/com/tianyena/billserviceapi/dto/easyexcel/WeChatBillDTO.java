package com.tianyena.billserviceapi.dto.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description     微信账单对象
 * <p>
 *     微信账单明细对象
 *     line1:微信支付账单明细
 *     line2:微信昵称：[这谁顶得住啊]
 *     line3:起始时间：[2021-03-04 00:00:00] 终止时间：[2021-06-04 23:59:59]
 *     line4:导出类型：[全部]
 *     line5:导出时间：[2021-06-22 20:11:44]
 *     line6:
 *     line7:共45笔记录
 *     line8:收入：19笔 8184.06元
 *     line9:支出：24笔 14481.06元
 *     line10:中性交易：2笔 6223.00元
 *     line11:注：
 *     line12:1. 充值/提现/理财通购买/零钱通存取/信用卡还款等交易，将计入中性交易
 *     line13:2. 本明细仅展示当前账单中的交易，不包括已删除的记录
 *     line14:3. 本明细仅供个人对账使用
 *     line15:
 *     line16:----------------------微信支付账单明细列表--------------------
 *     line17:交易时间	交易类型	交易对方	商品	收/支	金额(元)	支付方式	当前状态	交易单号	商户单号	备注
 *     line18:2021/6/4 10:03	微信红包	牛丼咖喱	/	收入	¥3.00	/	已存入零钱	"1000039801000106046135070771075	"	"1000039801202106046135070771075	"	/
 *     linen:
 *
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

    @ApiModelProperty(value="交易对方",required = true)
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
    private String businessNo;

    @ApiModelProperty(value="备注",required = true)
    @ExcelProperty(index = 10)
    private String transMemo;
}
