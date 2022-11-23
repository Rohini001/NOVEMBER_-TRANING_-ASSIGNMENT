package com.example.assigment.oops;

public class Electornics {

	private String id;
	private String semiconductorType;
	private String dateOfManufacturing;
	
	
	public String toString() {
		return "Electornics [id=" + id + ", semiconductorType=" + semiconductorType + ", dateOfManufacturing="
				+ dateOfManufacturing + "]";
	}


	public Electornics(String id, String semiconductorType, String dateOfManufacturing) {
		super();
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}


	public static void main(String[] args) {
		
		Electornics e = new Mobile("1", "abc", "1 Nov 2022");
		Electornics e1 = new LCD("2", "xyz", "10 Nov 2022");
		Electornics e2 = new Laptop("3", "lmn", "20 Nov 2022");
		
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
	}

}
