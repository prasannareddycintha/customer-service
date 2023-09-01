package com.customer.manage.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class AddressModel {
	private int addressId;
	@NotBlank(message = "Line1 should not be null")
	private String line1;
	@NotBlank(message = "Line2 should not be null")
	private String line2;
	private String line3;
	@NotBlank(message = "City should not be null")
	private String city;
	@NotBlank(message = "State should not be null")
	private String state;
	@Pattern(regexp = "^\\d{5,6}", message = "invalid postal code must be 5 or 6 digits")
	private String postalCode;

	public AddressModel() {
		super();
	}

	public AddressModel(int addressId, String line1, String line2, String line3, String city, String state,
			String postalCode) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressModel [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", line3=" + line3
				+ ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + "]";
	}
}
