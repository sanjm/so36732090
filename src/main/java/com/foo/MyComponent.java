package com.foo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    @Value("${key}")
    private String key;

    public String getKey(){
        return key;
    }
}
