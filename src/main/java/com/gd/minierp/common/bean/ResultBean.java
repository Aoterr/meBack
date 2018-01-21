package com.gd.minierp.common.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean {

    private boolean ret;


    private Object data;


    public static ResultBean buildRightResult(Object data) {
        ResultBean resultBean = new ResultBean();
        resultBean.ret = true;
        resultBean.data = data;
        return resultBean;
    }

    public static ResultBean buildErrorResult(String errMsg) {
        ResultBean resultBean = new ResultBean();
        resultBean.ret = false;
        resultBean.data = errMsg;
        return resultBean;
    }


}
