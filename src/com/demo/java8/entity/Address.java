package com.demo.java8.entity;

public class Address {
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", city=" + city + "]";
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(String houseNo, String streetName, String city) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
	}

	private String houseNo;
	
	private String streetName;
	
	private String city;
	
	

}
