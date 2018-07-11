package com.client.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao implements MyDaoInterface {

	@Override
	public void mydaoMethod(String dname) {
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		// TODO Auto-generated method stub
		logger.info("In Dao..");
		logger.info("my name is "+dname);

		
	}
	
	

}
