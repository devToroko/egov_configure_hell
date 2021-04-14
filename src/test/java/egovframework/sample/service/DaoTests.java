package egovframework.sample.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import egovframework.sample.service.impl.SampleDAOSpring;
import egovframework.sample.vo.SampleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/egovframework/spring/context-*.xml")
@Transactional //무조건 롤백
public class DaoTests {
	
	@Autowired
	SampleDAOSpring dao;
	

	@Test
	public void insertSample() {
		
		
		
	}

	@Test
	public void updateSample() {
		
	}

	@Test
	public void deleteSample() {
		
	}

	@Test
	public void selectSample() {
		SampleVO build = SampleVO.builder()
			.id("SAMPLE-00001").build();
		SampleVO selectSample = dao.selectSample(build);
		assertEquals(build.getId(), selectSample.getId());
	}

	@Test
	public void selectSampleList() {
		List<SampleVO> selectSampleList = dao.selectSampleList(new SampleVO());
		assertTrue(selectSampleList.size() > 0);
	}
}
