package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDao;
import egovframework.sample.vo.SampleVO;

@Repository("daoSpring")
public class SampleDAOSpring implements SampleDao {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	private final String SAMPLE_INSERT = "INSERT INTO SAMPLE(ID, TITLE, REG_USER, CONTENT, REG_DATE) VALUES (? , ? , ? ,? , NOW())";
	
	private final String SAMPLE_UPDATE = "UPDATE SAMPLE SET TITLE = ?, REG_USER = ?, CONTENT = ? WHERE ID = ? ";
	
	private final String SAMPLE_DELETE = "DELETE FROM SAMPLE WHERE ID = ?";
	
	private final String SAMPLE_GET = "SELECT ID, TITLE, REG_USER, CONTENT, REG_DATE FROM SAMPLE WHERE ID = ?";
	
	private final String SAMPLE_LIST = "SELECT ID, TITLE, REG_USER, CONTENT, REG_DATE FROM SAMPLE ORDER BY REG_DATE DESC";
	
	@Override
	public void insertSample(SampleVO vo) {
		System.out.println("====> Spring으로 insertSample() 기능 처리");
		Object[] args = {vo.getId(), vo.getTitle(), vo.getRegUser(), vo.getContent()};
		jdbcTemplate.update(SAMPLE_INSERT, args);
	}

	@Override
	public void updateSample(SampleVO vo) {
		System.out.println("====> Spring으로 updateSample() 기능 처리");
		Object[] args = {vo.getTitle(), vo.getRegUser(), vo.getContent(), vo.getId()};
		jdbcTemplate.update(SAMPLE_UPDATE, args);
	}

	@Override
	public void deleteSample(SampleVO vo) {
		System.out.println("====> Spring으로 deleteSample() 기능 처리");
		Object[] args = {vo.getId()};
		jdbcTemplate.update(SAMPLE_DELETE, args);
	}

	@Override
	public SampleVO selectSample(SampleVO vo) {
		System.out.println("====> Spring으로 selectSample() 기능 처리");
		Object[] args = {vo.getId()};
		return jdbcTemplate.queryForObject(SAMPLE_GET, args, new SampleRowMapper());
	}

	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) {
		System.out.println("====> Spring으로 selectSampleList() 기능 처리");
		return jdbcTemplate.query(SAMPLE_LIST, new SampleRowMapper());
	}

}
