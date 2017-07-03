package com.mustafaergan.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.mustafaergan.aop.MyService.hello(..))")
	public void before(JoinPoint joinpoint) {
		System.out.println("Before " + joinpoint.getSignature().getName());
	}

	@After("execution(* com.mustafaergan.aop.MyService.hello(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* com.mustafaergan.aop.MyService.sum(..))", returning = "toplamSonuc")
	public void afterReturning(JoinPoint joinPoint, Object toplamSonuc) {
		System.out.println("After returning " + joinPoint.getSignature().getName());
		System.out.println("Return value:" + toplamSonuc);
	}

	@AfterReturning(pointcut = "execution(* com.mustafaergan.aop.MyService.sumList(..))", returning = "toplamList")
	public void afterReturningListObject(JoinPoint joinPoint, Object toplamList) {
		System.out.println("After returning " + joinPoint.getSignature().getName());
		System.out.println("Return value:" + toplamList);
	}

	@AfterReturning(pointcut = "execution(* com.mustafaergan.aop.MyService.sumObject(..))", returning = "toplamObj")
	public void afterReturningObject(JoinPoint joinPoint, Object toplamObj) {
		System.out.println("After returning " + joinPoint.getSignature().getName());
		System.out.println("Return value:" + toplamObj);
	}

	@AfterThrowing(pointcut = "execution(* com.mustafaergan.aop.MyService.sum(..))", throwing = "exception")
	public void afterThrowException(JoinPoint joinPoint, Throwable exception) {
		System.out.println("Hata: " + exception);

	}

}
