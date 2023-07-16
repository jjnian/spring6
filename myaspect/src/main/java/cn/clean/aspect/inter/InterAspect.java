package cn.clean.aspect.inter;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 *
 */
@Component
public class InterAspect implements MethodInterceptor {

	@Nullable
	@Override
	public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
		System.out.println("Before: invocation=[" + invocation + "]");
		Object rval = invocation.proceed();
		System.out.println("Invocation returned");
		return rval;
	}
}
