package egovframework.sample.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import egovframework.sample.vo.SampleVO;


public class SampleRowMapper implements RowMapper<SampleVO>{

	@Override
	public SampleVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		SampleVO sample = SampleVO.builder()
			.id(rs.getString("ID"))
			.title(rs.getString("TITLE"))
			.regUser(rs.getString("REG_USER"))
			.content(rs.getString("CONTENT"))
			.regDate(rs.getDate("REG_DATE"))
			.build();
		
		return sample;
	}
	
}
