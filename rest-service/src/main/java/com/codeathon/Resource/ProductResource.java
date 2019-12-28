package com.codeathon.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String welcome(){
        return "Welcome";
    }
}
