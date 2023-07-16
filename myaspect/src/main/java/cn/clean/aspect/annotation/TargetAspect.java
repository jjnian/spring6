package cn.clean.aspect.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class TargetAspect {
	@Pointcut("@target(cn.clean.aspect.annotation.anno.TargetAnnotation)")
	public void argsPointCut(){

	}

	@Before("argsPointCut()")
	public void before(){
		System.out.println("@target before");
	}
}
