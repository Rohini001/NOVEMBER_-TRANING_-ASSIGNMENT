package com.example.assigment.oops;

public class Product {
	private String pid;
	private String pname;
	private String price;
	private String unitOfMeasurement;

	public Product(String pid, String pname, String price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	public Product() {
	}
	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

	public static void main(String[] args) {

		Product p = new Product("101", "LCD", "10000", "Rs");
		//Product p1 = (Product) p.clone();
		
		Product p2 = new Product();  
		p2.pname="TV";
		p2.price="20000";
		
		System.out.println(p.pid+" "+p.pname+" "+p.price+p.unitOfMeasurement);  
		System.out.println(p2.pname+" "+p2.price);
	//	System.out.println(p2.pid+" "+p2.pname+" "+p2.price+p2.unitOfMeasurement);
		
		System.out.println(p instanceof Product);  
	}

}
