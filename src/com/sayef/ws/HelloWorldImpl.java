package com.sayef.ws;

/**
 * Created by sayef on 7/19/16.
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.soap.SOAPBinding;

//Service Implementation Bean
@Stateless(name = "HelloWorldService")
@WebService(name="HelloWorldService", serviceName="HelloWorldService", portName = "HelloWorldServicePort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class HelloWorldImpl implements HelloWorld{

    @Override
    @WebMethod
    @WebResult(name = "name")
    public String getHelloWorldAsString(@WebParam(name = "name") String name) {
        return "Your name is " + name;
    }
}


