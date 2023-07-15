package cn.clean.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* cn.clean.service.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("方法前");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("AfterThrowing方法执行");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("AfterReturning方法执行");
    }

    // @Around("pointCut()")
    // public void around(){
    //     System.out.println("around方法执行");
    // }

    @After("pointCut()")
    public void after(){
        System.out.println("方法后");
    }
}
