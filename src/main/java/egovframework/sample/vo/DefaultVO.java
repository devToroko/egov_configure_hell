package egovframework.sample.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultVO {
	
	// 순번
	private String rn;
	
	// 검색 조건
	@Builder.Default
	private String searchCondition = "";
	
	// 검색 keyWord
	@Builder.Default
	private String searchKeyword = "";
	
	// 현재 페이지
	@Builder.Default
	private int pageIndex = 1;
	
	// 페이지 갯수
	@Builder.Default
	private int pageUnit = 10;
	
	// 페이지 사이즈
	@Builder.Default
	private int pageSize = 10;
	
	
	// firstIndex
	@Builder.Default
	private int firstIndex = 0;
	
	
	// lastIndex
	@Builder.Default
	private int lastIndex = 0;
	
	//recordCountPerPage 
	@Builder.Default
	private int recordCountPerPage = 10;
	
	
	// 검색 구분1
	@Builder.Default
	private String searchGbn1 = "";

	// 검색 구분2
	@Builder.Default
	private String searchGbn2 = "";
	
	// 검색 구분3
	@Builder.Default
	private String searchGbn3 = "";
	
	// 검색 구분4
	@Builder.Default
	private String searchGbn4 = "";
	
	
	// 시작일
	@Builder.Default
	private String txtBeginDt = "";
	
	
	// 종료일
	@Builder.Default
	private String txtEndDt = "";
	
	
	// 페이지 타입?
	private String pagingTy;
	
	
	// 등록자 ID
	private String registerId;
}
