package com.serializable;

import java.io.Serializable;

public class Address implements Serializable {

	public String ladr;
	public String padr;

	public Address(String ladr, String padr) {
		this.ladr = ladr;
		this.padr = padr;
	}

}
