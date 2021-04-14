package egovframework.sample.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import egovframework.sample.mappers.TimeMapper;
import egovframework.sample.vo.SampleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/egovframework/spring/context-*.xml")
public class SampleServiceClient {

	
	@Autowired
	TimeMapper timeMapper;
	
	@Autowired
	SampleService sampleService;
	
	@Test
	public void springContainerTest() {
		SampleVO vo = SampleVO.builder()
			.title("아이디 자동 생성 테스트")
			.regUser("테스터")
			.content("아이디 자동.....").build();
		sampleService.insertSample(vo);
		
		List<SampleVO> sampleList = sampleService.selectSampleList(vo);
		System.out.println(sampleList);
		
	}
}
