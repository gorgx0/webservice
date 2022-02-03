package com.ws02;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

    public static void main(String[] args) {
        MyService myService = new MyServiceImp();
//        Endpoint.publish("http://localhost:9000/helloWorld", myService);


        JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
        svrFactory.setServiceClass(MyServiceImp.class);
        svrFactory.setAddress("http://localhost:9000/serviceMy");
        svrFactory.setServiceBean(myService);
        svrFactory.create();
    }

}
