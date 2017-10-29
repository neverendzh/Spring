package com.kaishengit.proxy;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 * 代理类
 */
public class Proxy implements Sales {

    private Sales sales;
    public Proxy(Sales sales){
        this.sales = sales;
    }
    @Override
    public void salesPc() {
        sales.salesPc();
    }
}
