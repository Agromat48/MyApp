package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* org.example.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Перед вызовом метода " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* org.example.TaskManager.*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("После возращения результатов " + joinPoint.getSignature().getName()
        + " результат равен: " + result);
    }

}
