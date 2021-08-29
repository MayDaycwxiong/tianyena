package com.tianyena.billserviceapi.dto.easyexcel;

/**
 * @author cuiwx
 * @version 1.0  2021/8/29
 * @description <p> 账单公共继承父类
 */
public abstract class AbstractBaseBillBean {
    /**
     * @return
     * @description <p> 获取具体待读取的类
     * @author cuiwx  2021/8/29
     */
    public abstract Class getTargetClazz();

    /**
     * @return
     * @description <p>表格从${n}行开始读取
     * @author cuiwx  2021/8/29
     */
    public abstract Integer getHeadRowNumber();
}
