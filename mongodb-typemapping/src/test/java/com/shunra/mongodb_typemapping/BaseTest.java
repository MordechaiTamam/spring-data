package com.shunra.mongodb_typemapping;

import org.apache.commons.logging.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

import com.mongodb.Mongo;

@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class BaseTest extends AbstractTestNGSpringContextTests {

	protected static Log log;
	public static Object synchObject = new Object();

	@Autowired
	Mongo mongo;

	@BeforeMethod()
	protected void beforeTest() {
	}

	@BeforeSuite(dependsOnMethods = { "springTestContextPrepareTestInstance" })
	public void setUp() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Override
	@BeforeSuite(alwaysRun = true)
	protected void springTestContextBeforeTestClass() throws Exception {

		String log4jPath = getClass().getClassLoader().getResource("log4j.xml").getPath();

		// LogFactory.configureAndWatch(log4jPath, null);
		log = LogFactory.getLog(BaseTest.class);
		super.springTestContextBeforeTestClass();
	}

	@Override
	@BeforeSuite(alwaysRun = true, dependsOnMethods = "springTestContextBeforeTestClass")
	protected void springTestContextPrepareTestInstance() throws Exception {
		super.springTestContextPrepareTestInstance();
	}

	@AfterSuite
	protected void springTestContextDestroyTestInstance() {
		// mongo.dropDatabase(com.shunra.poc.sample.mongodb.configuration.ContextConfiguration.dbName);
	}
}
