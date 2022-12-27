package com.mx.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

/**
 * 用来测试接口运行一万次的效率
 * <p>
 * 新增
 *
 * @author echo
 * @version 1.1
 **/
/*@Aspect
@Component*/
public class AccountAdvice {

    //
    // @Around("execution(com.mx.service.save())")
    // 环形通知
    //@Around("execution(* com.mx.*.*Service.*(..))")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        // Signature 对象封装了此次执行的信息（签名信息）
        Signature signature = pjp.getSignature();
        String typeName = signature.getDeclaringTypeName();
        String name = signature.getName();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        // 这里跑的时候可以我能玩
        System.out.println();
        System.out.println();
        System.out.println("业务层接口执行万次时间: " + typeName + "." + name + (end - start) + "ms");
    }

}