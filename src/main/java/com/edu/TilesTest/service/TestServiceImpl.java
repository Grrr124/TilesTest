package com.edu.TilesTest.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.edu.TilesTest.model.TestDAO;
import com.edu.TilesTest.model.TestDTO;

@Component
public class TestServiceImpl implements TestService {

	@Autowired
	private SqlSession SqlSession;

	@Override
	public void TestInsert(TestDTO TD) { //추가 
		TestDAO DAO = SqlSession.getMapper(TestDAO.class);
		DAO.TestInsert(TD);
		
	}
	
}
