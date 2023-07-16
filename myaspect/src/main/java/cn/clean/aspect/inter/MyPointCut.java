package cn.clean.aspect.inter;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.MethodMatcher;
import org.springframework.aop.Pointcut;

/**
 *
 */
public class MyPointCut implements Pointcut {
	@Override
	public ClassFilter getClassFilter() {
		return null;
	}

	@Override
	public MethodMatcher getMethodMatcher() {
		return null;
	}
}
