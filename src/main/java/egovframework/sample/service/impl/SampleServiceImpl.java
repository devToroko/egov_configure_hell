package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.cmmn.exception.FdlException;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.sample.service.SampleDao;
import egovframework.sample.service.SampleService;
import egovframework.sample.vo.SampleVO;

@Service("sampleService")
public class SampleServiceImpl extends EgovAbstractServiceImpl implements SampleService {
	
	@Resource(name="daoMyBatis")
	private SampleDao sampleDao;
	
	@Resource(name="egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;
	
	@Override
	public void insertSample(SampleVO vo) {
		System.out.println("SampleService---Sample 등록");
		try {
			String id = egovIdGnrService.getNextStringId();
			vo.setId(id);
			sampleDao.insertSample(vo);
		} catch (FdlException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateSample(SampleVO vo) {
		System.out.println("SampleService---Sample 수정");
		sampleDao.updateSample(vo);
	}

	@Override
	public void deleteSample(SampleVO vo) {
//		throw new IllegalArgumentException();
		System.out.println("SampleService---Sample 삭제");
		sampleDao.deleteSample(vo);
	}

	@Override
	public SampleVO selectSample(SampleVO vo) {
		System.out.println("SampleService---Sample 상세조회");
		return sampleDao.selectSample(vo);
	}
	
	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) {
		System.out.println("SampleService---Sample 목록 검색");
		return sampleDao.selectSampleList(vo);
	}
	
}
