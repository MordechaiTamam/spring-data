package com.shunra.mongodb_typemapping;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "A")
@TypeAlias("A")
public class AImpl {

	@Field
	public String name;

	@Reference
	public BInterface b;

	public AImpl(String name, BInterface b) {
		this.name = name;
		this.b = b;
	}

}
