package aop.domain;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

//	@Before(value = "execution(* com.example.demo..*(..))")
//	public void beforeAdvice(JoinPoint point) {
//		System.out.println("beforrrreeeeeeeeeeee..........");
//		point.getThis();
//	}

	@After(value = "execution(* aop.domain..*(..))")
	//@After(value = "execution(* aop.domain.DefaultUsers.userById*(..))")
	public void afterAdvice(JoinPoint point) {
		System.out.println("after..........");
		var th = point.getThis();
		var tar = point.getArgs()[0];
		System.out.println(tar);
	}

//	@Around(value = "execution(* com.example.demo..*(..))")
//	public void aroundAdvice(ProceedingJoinPoint point) throws Throwable {
//		System.out.println("bbbbbbbb..........");
//
//		point.proceed();
//
//		System.out.println("aaaaaaa..........");
//	}
}
