package egovframework.sample.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import egovframework.rte.fdl.cmmn.trace.handler.TraceHandler;

public class DefaultTraceHandler implements TraceHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultTraceHandler.class);
	
	@Override
	public void todo(Class<?> clazz, String message) {
		LOGGER.debug("[TRACE]ClASS::: {}", clazz.getName());
		LOGGER.debug("[TRACE]MESSAGE::: {}", message);
		// 이곳에서 후속 처리로 필요한 앳견을 취할 수 있다.
	}

}
