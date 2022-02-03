package com.ws02;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {
        ver01();
        ver02();
    }

    private static void ver02() {
        MyService myService = new MyServiceImp();
        JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
        svrFactory.setServiceClass(MyServiceImp.class);
        svrFactory.setAddress("http://localhost:9000/serviceMy");
        svrFactory.setServiceBean(myService);
        svrFactory.create();
    }

    private static void ver01() {
        MyService myService = new MyServiceImp();
        Endpoint.publish("http://localhost:9001/xSrvc", myService);
    }

}
