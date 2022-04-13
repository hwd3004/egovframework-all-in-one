package egovframework.dummy.service;

import org.springframework.http.ResponseEntity;

import egovframework.dummy.model.DummyUser;

public interface DummyUserService {

	public ResponseEntity<String> signup(DummyUser dummyUser);
	
}
