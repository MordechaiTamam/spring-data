package com.shunra.mongodb_typemapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;

public class MyBean {

	@Autowired
	MongoOperations mongoOperations;

	public void init() {
		mongoOperations.findAll(AImpl.class);

	}
}
