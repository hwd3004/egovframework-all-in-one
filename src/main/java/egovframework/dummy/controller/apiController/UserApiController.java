package egovframework.dummy.controller.apiController;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.dummy.model.DummyUser;
import egovframework.dummy.service.DummyUserService;

@RestController
public class UserApiController {

	@Resource(name = "DummyUserService")
	private DummyUserService dummyUserService;

	@PostMapping("/dummy/account/signup")
	public String signup(DummyUser dummyUser) {

		dummyUserService.signup(dummyUser);

		return null;
	}

}
