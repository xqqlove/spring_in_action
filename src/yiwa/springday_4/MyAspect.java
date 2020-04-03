package yiwa.springday_4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class MyAspect {
    @Before("execution(* yiwa.springday_4.Perform.perform(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName=jp.getSignature().getName();
        System.out.println("【前置通知】the method 【"+methodName+"】begins with "+ Arrays.asList(jp.getArgs()));
    }
    @After("execution(* yiwa.springday_4.Perform.perform(..))")
    public void afterMethod(JoinPoint ip){
        System.out.println("【后置通知】 this is afterMethod advice...");
    }

}
