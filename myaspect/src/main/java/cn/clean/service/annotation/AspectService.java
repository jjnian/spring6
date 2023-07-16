package cn.clean.service.annotation;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

    String name;

    public String aspect(String name, String address){
        System.out.println("hello aspect");
        System.out.println("args:" + name + " args:" + address);
        return "hello aspect";
    }
}
