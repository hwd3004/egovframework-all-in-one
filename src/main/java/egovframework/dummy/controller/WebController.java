package egovframework.dummy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/dummy/index")
	public String index() {
		return "dummy/index";
	}

	@GetMapping("/dummy/account/signup")
	public String signup() {
		return "dummy/account/signup";
	}

}
