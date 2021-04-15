package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/* curong 2021. 4. 15. 오후 7:55:17  TODO ->     AOP 적용 (관점 지향 프로그래밍)     */
@Aspect
@Component
public class TimeTraceAop {
    
    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
	long start = System.currentTimeMillis(); 
	System.out.println("START: " + joinPoint.toString());
	
	try {
	    return joinPoint.proceed();
	}finally {
	    long finish = System.currentTimeMillis();
	    long timeMs = finish - start;
	    System.out.println("END: "+ joinPoint.toString() + " " + timeMs + "ms");
	}
    }
    
}
