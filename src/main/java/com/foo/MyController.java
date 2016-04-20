package com.foo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Value("${key}")
    private String key;

    public String getKey(){
        return key;
    }
}
