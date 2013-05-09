package com.shunra.mongodb_typemapping;

import org.apache.commons.logging.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.*;

@Configuration
public class ContextConfiguration {
	Log log = LogFactory.getLog(ContextConfiguration.class);
	public static final String dbName = "mongo_type_mappaing";// UUID.randomUUID().toString().substring(0, 5);

	@Bean
	@Autowired
	public MongoDbFactory mongoDbFactory() throws Exception {
		SimpleMongoDbFactory retVal = new SimpleMongoDbFactory(new Mongo(), dbName);
		retVal.setWriteConcern(WriteConcern.ACKNOWLEDGED);
		return retVal;
	}

	@Bean(initMethod = "init")
	MyBean myBean() {
		return new MyBean();
	}

}
