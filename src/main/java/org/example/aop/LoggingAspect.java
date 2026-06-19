package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Before("execution(* org.example.TaskManager.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        System.out.println("Перед вызовом метода " + joinPoint.getSignature().getName());
//    }
//
//    @AfterReturning(value = "execution(* org.example.TaskManager.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        System.out.println("После возращения результатов " + joinPoint.getSignature().getName()
//        + " результат равен: " + result);
//    }
//
//    @AfterThrowing(value = "execution(* org.example.TaskManager.*(..))",
//            throwing = "exc"
//    )
//    public void after(JoinPoint joinPoint, Exception exc) {
//        System.out.println("После исключения: " + exc.getMessage() + " в " + joinPoint.getSignature().getName());
//    }
//
//    @After("execution(* org.example.TaskManager.*(..))")
//    public void after(JoinPoint joinPoint) {
//        System.out.println("После выполнения метода: " + joinPoint.getSignature().getName());
//    }

//    @Around("execution(* org.example.TaskManager.*(..))")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) {
//        System.out.println("До метода");
//        //currentTime
//        Object result = null;
//        try {
//            result = proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//          log
//            throw new RuntimeException(e);
//        }
//        //currentTime
//        System.out.println("После метода");
//
//        return result;
//    }

    @Before("@annotation(loggable)")
    public void log(JoinPoint joinPoint, Loggable loggable) {
        System.out.println("LOG: before method: " + joinPoint.getSignature().getName());
    }
}
