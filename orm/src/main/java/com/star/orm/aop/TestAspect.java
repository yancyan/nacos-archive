// package com.star.orm.aop;
//
// import lombok.extern.slf4j.Slf4j;
// import org.aspectj.lang.ProceedingJoinPoint;
// import org.aspectj.lang.annotation.*;
// import org.springframework.stereotype.Component;
//
// /**
//  * @author ZhuYX
//  * @date 2020/10/29 14:18
//  */
// @Slf4j
// @Component
// @Aspect
// public class TestAspect {
//
//     @Pointcut("execution(* com.star.orm.api.business..*(..))")
//     public void pointcut() {
//     }
//
//     @After("pointcut()")
//     public void after() {
//         log.info("########## after exec...");
//     }
//
//     @Before("pointcut()")
//     public void before() {
//         log.info("########## before exec...");
//     }
//
//     @Around("pointcut()")
//     public Object around(ProceedingJoinPoint pjp) throws Throwable {
//         log.info("########## around exec...");
//         return pjp.proceed();
//     }
// }
