package com.ws02;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyService {

    @WebMethod
    public String serviceCall(String argument) {
        return "****** " + argument + " ******";
    }

}
