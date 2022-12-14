package com.example.assignment.tdd.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Q7_Company {
	public int countemployee() {

		Employee1 emp1 = new Employee1(101, "aaa", "Software Engineer");
		Employee1 emp2 = new Employee1(102, "bbb", "module lead");
		Employee1 emp3 = new Employee1(103, "ccc", "Mangaer");
		Employee1 emp4 = new Employee1(104, "ddd", "Hr");
		Employee1 emp5 = new Employee1(105, "eee", "CEO");

		Company1 c1 = new Company1("Yash", emp1);
		Company1 c2 = new Company1("Yash", emp2);
		Company1 c3 = new Company1("Yash", emp3);
		Company1 c4 = new Company1("Yash", emp4);
		Company1 c5 = new Company1("Yash", emp5);

		List<Company1> list = new ArrayList<Company1>();

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);

		int empno = list.size();
		System.out.println("no of employee working in " + empno);

		return empno;

	}

	public static void main(String[] args) {

		Q7_Company ap = new Q7_Company();

		int empcount = ap.countemployee();
		System.out.println(empcount);

	}
}

class Employee1 {
	private int emp_ID;
	private String emp_Name;
	private String emp_Designation;

	public Employee1(int emp_ID, String emp_Name, String emp_Designation) {
		super();
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
	}

	@Override
	public String toString() {
		return "Employee1 [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", emp_Designation=" + emp_Designation + "]";
	}

}

class Company1 {
	private String companyname;
	private Employee1 emp;

	public Company1(String companyname, Employee1 emp) {
		super();
		this.companyname = companyname;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company1 [companyname=" + companyname + ", emp=" + emp + "]";
	}

}
