package com.example.assigment.oops;

public class Demo1 {

	public static void main(String[] args) {

		Department[] d = new Department[2];
		d[0] = new Department(101, "IT dept");
		d[1] = new Department(102, "Sales dept");
	//	System.out.println(d[0].toString());
	//	System.out.println(d[1].toString());

		Employee e = new Employee(1, "Rohini", "Pune", "04/02/2000", "04/02/2022", "Pune", d[0].toString(),
				"9976546789", "abc@gmail.com");

		System.out.println(e);
		Customer c = new Customer(1, "Rohini", "Pune", "04/02/2000", "04/02/2022", "Pune", "9654556789",
				"xyz@gmail.com");
		System.out.println(c);
	}

}
