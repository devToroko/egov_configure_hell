package egovframework.sample.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.sample.egov_common.EgovMessageSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/egovframework/spring/context-*.xml")
public class MessageResourceTest {
	
	@Autowired
	MessageSource messageSource;
	
	@Autowired
	EgovMessageSource egovMessageSource;
	
	@Test
	public void test1() {
		assertNotNull(messageSource);
		
		System.out.println("Locale.getDefault() : " + messageSource.getMessage("list.mainTitle", null, Locale.getDefault()));
		System.out.println("Locale.KOREA : " + messageSource.getMessage("list.mainTitle", null, Locale.KOREA));
		System.out.println("Locale.ENGLISH : " + messageSource.getMessage("list.mainTitle", null, Locale.ENGLISH));
		System.out.println("Locale.ITALIAN : " + messageSource.getMessage("list.mainTitle", null, Locale.ITALIAN));
		
		assertEquals("SAMPLE 목록", messageSource.getMessage("list.mainTitle", null, Locale.getDefault()));
		assertEquals("SAMPLE 목록", messageSource.getMessage("list.mainTitle", null, Locale.KOREA));
		assertEquals("LIST SAMPLE", messageSource.getMessage("list.mainTitle", null, Locale.ENGLISH));
		assertEquals("SAMPLE 목록", messageSource.getMessage("list.mainTitle", null, Locale.ITALIAN));
		
	}

	@Test
	public void egovMessageSourceTest() {
		assertNotNull(egovMessageSource);
		if(Locale.getDefault() == Locale.KOREA) {
			assertEquals("SAMPLE 목록", egovMessageSource.getMessage("list.mainTitle"));
		}
	}
	
}
