package egovframework.dummy.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import egovframework.dummy.model.DummyUser;
import egovframework.dummy.service.DummyUserService;

@Service("DummyUserService")
public class DummyUserServiceImpl implements DummyUserService {

	@Override
	public ResponseEntity<String> signup(DummyUser dummyUser) {
		if (!dummyUser.getUserPassword().equals(dummyUser.getConfirmPassword())) {

			return new ResponseEntity<String>("비밀번호를 확인해주세요.", HttpStatus.BAD_REQUEST);
		}
		
//		공백 검사, 특수문자 검사, 한글 검사는 AOP로
		
		

		return null;
	}

}
