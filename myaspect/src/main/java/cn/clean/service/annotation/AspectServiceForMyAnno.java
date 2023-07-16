package cn.clean.service.annotation;

import cn.clean.aspect.annotation.anno.MyAnnotation;
import cn.clean.aspect.annotation.anno.TargetAnnotation;
import cn.clean.aspect.annotation.anno.WithAnnotation;
import org.springframework.stereotype.Service;

@Service
@TargetAnnotation
@WithAnnotation
public class AspectServiceForMyAnno {


    @MyAnnotation
    public String aspect(String name){
        System.out.println("hello aspect");
        return "hello aspect";
    }

    public String aspect(ArgsService argsService){
        System.out.println("method of useing");
        return "hello aspect";
    }
}
