package cn.clean.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* cn.clean.service.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("Before");
    }

    @AfterThrowing(pointcut = "pointCut()",throwing = "ex")
    public void afterThrowing(Exception ex){
        ex.printStackTrace();
        System.out.println("AfterThrowing");
    }

    @AfterReturning(pointcut = "pointCut()", returning = "result")
    public void afterReturning(Object result){
        System.out.println("AfterReturning:"+result);
    }

     @Around("pointCut()")
     public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
         System.out.println("Around before");
         Object proceed = joinPoint.proceed();
         System.out.println("Around after:" + proceed);
         return proceed;
     }

    @After("pointCut()")
    public void after(){
        System.out.println("After");
    }
}
