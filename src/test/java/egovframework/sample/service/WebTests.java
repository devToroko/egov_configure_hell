package egovframework.sample.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/config/dispatcher-servlet.xml", "classpath:egovframework/spring/context-*.xml"})
public class WebTests {

	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).addFilter(new CharacterEncodingFilter("UTF-8")).build();
	}
	
	@Test
	public void 목록_조회() throws Exception {
		
		mockMvc
		.perform(get(
			"/selectSample.do")
			.param("id", "SAMPLE-00001"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("/WEB-INF/sample/selectSample.jsp"));
	}
	
}
