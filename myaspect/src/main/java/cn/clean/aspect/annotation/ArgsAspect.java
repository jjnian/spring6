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
public class ArgsAspect {

	// 针对所有方法符合这个参数的类型的
 	@Pointcut("args(java.lang.String)")
	public void argsPointCut(){

	}

	@Pointcut("@args(cn.clean.aspect.annotation.anno.ArgsAnnotation)")
	public void argsPointCut1(){

	}

	@Before("argsPointCut()")
	public void before(){
		System.out.println("args before");
	}

	@Before("argsPointCut1()")
	public void before1(){
		System.out.println("@args before");
	}
}
