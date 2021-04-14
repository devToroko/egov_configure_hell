package egovframework.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import egovframework.sample.vo.SampleVO;

@Controller
public class ValidationTestController {

	
	@GetMapping("/home")
	public String test() {
		return "validate_test/home";
	}
	
	@GetMapping("/register")
	public String viewRegisterationForm(@ModelAttribute("sample") SampleVO vo) {
		vo.setId("SAMPLE-00010");
		vo.setContent("content-test");
		vo.setRegUser("test-User");
		return "validate_test/registration";
	}
	
	@PostMapping("/register")
	public String doRegister(RedirectAttributes redirectAttributes) {
		//redirectAttributes.getFlashAttributes();
		return "validate_test/registration";
	}
}
