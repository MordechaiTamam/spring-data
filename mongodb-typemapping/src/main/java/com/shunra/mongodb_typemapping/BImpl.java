package com.shunra.mongodb_typemapping;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@TypeAlias("B")
public class BImpl implements BInterface {

	String name;

	public BImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
