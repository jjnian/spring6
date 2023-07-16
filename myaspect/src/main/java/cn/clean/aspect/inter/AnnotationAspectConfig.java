package cn.clean.aspect.inter;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.framework.ReflectiveMethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 */
@Aspect
@Component
public class AnnotationAspectConfig {

	@Autowired
	private InterAspect interAspect;

	@Around("execution(* cn.clean.service.inter.InterAspectService.*(..))")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("AnnotationAspectConfig before");
		return joinPoint.proceed();
	}
}
