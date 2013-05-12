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
		List<AImpl> lst = mongoOperations.findAll(AImpl.class);

		Assert.assertEquals(lst.size(), 1);
	}
}
