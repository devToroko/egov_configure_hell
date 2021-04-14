package egovframework.sample.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import egovframework.sample.service.SampleDao;
import egovframework.sample.vo.SampleVO;

@Repository("daoMyBatis")
public class SampleDaoMyBatis extends EgovAbstractMapper implements SampleDao {

	
	public SampleDaoMyBatis(DataSource dataSource) {
		System.out.println("SampleDaoMyBatis 생성");
	}

	@Override
	public void insertSample(SampleVO vo) {                                
		System.out.println("===> MyBatis로 insertSample() 기능 처리");      
		insert("SampleMapper.insertSample", vo);
	}                                                           
	                                                            
                                                                
	@Override
	public void updateSample(SampleVO vo) {                                
		System.out.println("===> MyBatis로 updateSample() 기능 처리");
		update("SampleMapper.updateSample", vo);
	}                                                           
	                                                            
                                                                
	@Override
	public void deleteSample(SampleVO vo) {                                
		System.out.println("===> MyBatis로 deleteSample() 기능 처리");
		delete("SampleMapper.deleteSample", vo);
	}                                                           
	                                                            
                                                                
	@Override
	public SampleVO selectSample(SampleVO vo) {                                
		System.out.println("===> MyBatis로 selectSample() 기능 처리");
		return (SampleVO) selectOne("SampleMapper.selectSample", vo);
	}                                                           
	                                                            
	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) {                            
		System.out.println("===> MyBatis로 selectSampleList() 기능 처리");
		return selectList("SampleMapper.selectSampleList", vo);
	}                                                           
	                                                            
}
