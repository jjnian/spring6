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
public class WithAnnotationAspect {
	// 针对特别的包或者类
	@Pointcut("within(cn.clean.service..*)")
	public void withPointCut(){

	}

	@Pointcut("@within(cn.clean.aspect.annotation.anno.WithAnnotation)")
	public void withPointCut1(){

	}

	@Before("withPointCut()")
	public void test(){
		System.out.println("withPointCut before");
	}

	@Before("withPointCut1()")
	public void before3(){
		System.out.println("@within before");
	}
}
