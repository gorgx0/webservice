package com.ws02;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface MyService {
    @WebMethod
    String serviceCall(@WebParam(name = "argument") String argument);
}
