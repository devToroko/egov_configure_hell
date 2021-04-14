package egovframework.sample.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.sample.vo.SampleVO;

@RestController
public class SampleRestController {

	
	@GetMapping("sample")
	public SampleVO getSample() {
		
		SampleVO vo = SampleVO.builder()
			.id("Sample-Id")
			.title("sample-Title").build();
		
		return vo;
	}
}
