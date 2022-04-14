package egovframework.dummy.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.dummy.model.DummyUser;

@Repository("DummyUserDAO")
public class DummyUserDAO extends EgovComAbstractDAO {

	public int signup(DummyUser dummyUser) {
		return 0;
//		return insert(, dummyUser);
	}

}
