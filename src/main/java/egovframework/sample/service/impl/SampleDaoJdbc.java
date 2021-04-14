package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDao;
import egovframework.sample.vo.SampleVO;

@Repository("sampleDaoJdbc")
public class SampleDaoJdbc implements SampleDao {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public SampleDaoJdbc() {
		System.out.println("SampleDaoJdbc 생성");
	}

	public void insertSample(SampleVO vo) {                                
		System.out.println("===> JDBC로 insertSample() 기능 처리");      
	}                                                           
	                                                            
                                                                
	public void updateSample(SampleVO vo) {                                
		System.out.println("===> JDBC로 updateSample() 기능 처리");
	}                                                           
	                                                            
                                                                
	public void deleteSample(SampleVO vo) {                                
		System.out.println("===> JDBC로 deleteSample() 기능 처리");
	}                                                           
	                                                            
                                                                
	public SampleVO selectSample(SampleVO vo) {                                
		System.out.println("===> JDBC로 selectSample() 기능 처리");
		return null;
	}                                                           
	                                                            
	public List<SampleVO> selectSampleList(SampleVO vo) {                            
		System.out.println("===> JDBC로 selectSampleList() 기능 처리");
		return null;
	}                                                           
	                                                            
}
