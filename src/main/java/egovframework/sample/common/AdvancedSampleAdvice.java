package egovframework.sample.common;

import java.sql.SQLException;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AdvancedSampleAdvice {

	public void advancedBeforeLogic() {
		System.out.println("[사전처리] 비즈니스 로직 수행 전 동작");
	}
	
	public void advancedAfterLogic() {
		System.out.println("[사후처리] 비즈니스 로직 수행 후 동작");
	}
	
	public Object aroundLog(ProceedingJoinPoint pjp ) throws Throwable {
		System.out.println("[BEFORE]: 비즈니스  메소드 수행 전에 처리할 내용...");
		Object returnObj = pjp.proceed();
		System.out.println("[AFTER]: 비즈니스  메소드 수행 후에 처리할 내용...");
		return returnObj;
	}
	
	public void afterThrowingLogic(JoinPoint jp, Exception exceptionObj) {
		String method = jp.getSignature().getName();
		System.out.println("[예외 처리] " + method +"() 메소드 수행 중 예외 발생!!!!!!!");
		if(exceptionObj instanceof IllegalArgumentException) {
			System.out.println(" -- 부적절한 인자를 입력함 -- ");
		} else if(exceptionObj instanceof SQLException) {
			System.out.println("데이터베이스 연동에 문제가 발생했습니다. ");
		} else {
			System.out.println("잡아내지 못한 예외가 발생했습니다!");
			exceptionObj.printStackTrace();
		}
	}
}
