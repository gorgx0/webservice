package com.ws02;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.ws02.MyService", serviceName = "MyService")
public class MyServiceImp implements MyService {

    @Override
    public String serviceCall(String argument) {
        return "****** " + argument + " ******";
    }

}
