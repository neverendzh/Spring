package com.kaishengit.proxy;

import org.junit.Test;

/**
 * @author zh
 * Created by Administrator on 2017/10/29.
 */

public class ProxyText {

    @Test
    public void lenProxy(){
        LenovoProxy lenovoProxy = new LenovoProxy();
        lenovoProxy.salesPc();
    }

    @Test
    public void  proxy(){
        Lenovo lenovo = new Lenovo();
        Proxy proxy1 = new Proxy(lenovo);
        proxy1.salesPc();
        Dell dell = new Dell();
        Proxy proxy2 = new Proxy(dell);
        proxy2.salesPc();

    }

}
