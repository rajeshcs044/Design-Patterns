package com.builder;

import com.builder.Address.AddressBuilder;

public class AddressConsumer {

	public static void main(String[] args) {

		// Building with all the fields set
		AddressBuilder addressBuilder = new AddressBuilder();
		addressBuilder.setStreet1("5426 Charlotte st");
		addressBuilder.setStreet2("West 91st Street");
		addressBuilder.setCity("Overland Park");
		addressBuilder.setState("KS");
		addressBuilder.setZipCode(66211);
		Address address = addressBuilder.createAddress();
		address.showAddress();

		// Building with null street2
		addressBuilder = new AddressBuilder();
		addressBuilder.setStreet1("5426 Charlotte st");
		addressBuilder.setCity("Overland Park");
		addressBuilder.setState("KS");
		addressBuilder.setZipCode(66211);
		address = addressBuilder.createAddress();
		address.showAddress();
	}
}
