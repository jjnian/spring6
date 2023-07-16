package cn.clean.aspect.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionAspect {
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
         // 获取调用的方法所属的对象
         Object target = joinPoint.getTarget();

         // 获取调用方法所属的参数
         Object[] args = joinPoint.getArgs();

         //
         String kind = joinPoint.getKind();

         // 获取代理方法的修饰符、方法名等信息
         Signature signature = joinPoint.getSignature();
         signature.getName();

         // 获取 JoinPoint 的源代码位置信息
         SourceLocation sourceLocation = joinPoint.getSourceLocation();

         // 获取JoinPoint的类型信息
         JoinPoint.StaticPart staticPart = joinPoint.getStaticPart();

         // 调用代理的方法，返回值为代理方法的返回值
         // proceed()默认把参数直接传到代理对象
         Object proceed = joinPoint.proceed();

         // proceed(args):可以修改参数然后再传给代理对象
         // args[0] = "jiruixinxiugai";
         // Object proceed = joinPoint.proceed(args);

         System.out.println("Around after:" + proceed);
         return proceed;
     }

    @After("pointCut()")
    public void after(){
        System.out.println("After");
    }
}
