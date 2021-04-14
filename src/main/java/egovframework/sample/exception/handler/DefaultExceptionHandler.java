package egovframework.sample.exception.handler;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultExceptionHandler implements ExceptionHandler{
	
	@Override
	public void occur(Exception exception, String packageName) {
		log.debug("[HANDLER][PACKAGE]:::{}", packageName);
		log.debug("[HANDLER][Exception]:::{}", exception);
	}
	
}
