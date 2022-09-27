package com.pablovass.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RetryAspect {
    @Autowired
    private RetryTemplate retryTemplate;

    @Around("execution(* com..*Repository.*(..))")
    public  Object retry(final ProceedingJoinPoint point) throws Throwable {
       return  retryTemplate.execute(retryCallback->point.proceed());
    }
}
