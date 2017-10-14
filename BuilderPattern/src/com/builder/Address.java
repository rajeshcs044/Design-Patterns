package com.builder;

public class Address {
	private String street1;
	private String street2;
	private String city;
	private String state;
	private int zipCode;

	private Address(String street1, String street2, String city, String state, int zipCode) {
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public void showAddress() {
		System.out.println("street1 - " + street1 + ",");
		System.out.println("street2 - " + street2 + ",");
		System.out.println("City - " + city + ",");
		System.out.println("State - " + state + " - " + zipCode);
	}

	public static class AddressBuilder {
		private String street1;
		private String street2;
		private String city;
		private String state;
		private int zipCode;

		public void setStreet1(String street1) {
			this.street1 = street1;
		}

		public void setStreet2(String street2) {
			this.street2 = street2;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public Address createAddress() {
			return new Address(street1, street2, city, state, zipCode);
		}
	}
}
