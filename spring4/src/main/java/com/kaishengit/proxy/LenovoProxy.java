package com.kaishengit.proxy;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 */
public class LenovoProxy implements Sales {
    private  Lenovo lenovo = new Lenovo();
    @Override
    public void salesPc() {
        lenovo.salesPc();

    }
}
