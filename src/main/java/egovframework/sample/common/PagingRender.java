package egovframework.sample.common;

import javax.annotation.Resource;

import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import egovframework.sample.vo.DefaultVO;

public class PagingRender {

	/* 프로퍼티 서비스 */
	@Resource(name="propertiesService")
	protected EgovPropertyService propertiesService;
	
	
	public <Object extends DefaultVO> PaginationInfo setPaginationInfo(Object vo, int totalCnt) {
		PaginationInfo paginationInfo = new PaginationInfo();
		
		vo.setPageUnit(propertiesService.getInt("pageUnit"));
		vo.setPageSize(propertiesService.getInt("pageSize"));
		paginationInfo.setCurrentPageNo(vo.getPageIndex());
		paginationInfo.setRecordCountPerPage(vo.getPageUnit());
		paginationInfo.setPageSize(vo.getPageSize());
		paginationInfo.setTotalRecordCount(totalCnt);
		
		vo.setFirstIndex(paginationInfo.getFirstRecordIndex());
		vo.setLastIndex(paginationInfo.getLastRecordIndex());
		vo.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
		
		return paginationInfo;
	}
}
