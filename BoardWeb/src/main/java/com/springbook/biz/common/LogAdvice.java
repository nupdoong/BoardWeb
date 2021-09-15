package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.aspectj.lang.annotation.Before;

@Service
@Aspect
public class LogAdvice {
	
	@Before("PointcutCommon.allPointcut()")
	public void printLog() {
		System.out.println("[공통 로그] 비지니스 로직 수행 전 동작");
	}
}
