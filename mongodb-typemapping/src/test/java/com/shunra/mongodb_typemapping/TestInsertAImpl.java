package com.shunra.mongodb_typemapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInsertAImpl extends BaseTest {

	@Autowired
	MongoOperations mongoOperations;

	@Test
	public void testCreateAImpl() {
		// String name = UUID.randomUUID().toString().substring(0, 5);
		// BInterface b = new BImpl(name);
		//
		// AImpl a = new AImpl(name, b);
		// mongoOperations.save(a);

		List<AImpl> lst = mongoOperations.findAll(AImpl.class);

		Assert.assertEquals(lst.size(), 1);
	}
}
