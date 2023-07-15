package cn.clean.service;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

    String name;

    public String aspect(){
        System.out.println("hello aspect");
        return "hello aspect";
    }
}
