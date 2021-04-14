package egovframework.sample.service;

import java.util.List;

import egovframework.sample.vo.SampleVO;

public interface SampleService {

	void insertSample(SampleVO vo);

	void updateSample(SampleVO vo);

	void deleteSample(SampleVO vo);

	SampleVO selectSample(SampleVO vo);

	List<SampleVO> selectSampleList(SampleVO vo);

}