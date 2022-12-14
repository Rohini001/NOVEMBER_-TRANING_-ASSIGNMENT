package com.example.assignment.tdd.intermediate;

public class Q3_TestClass {

	public String displayIndex() {
		String url = "www.yash.com/index.jsp";
		String file = url.substring(url.lastIndexOf('/') + 1, url.lastIndexOf('.'));

		System.out.println(file);

		return file;
	}

	public String displaySalary() {
		String url = "www.yash.com/employee/salary.xhtml";
		String file = url.substring(url.lastIndexOf('/') + 1, url.lastIndexOf('.'));

		System.out.println(file);

		return file;
	}

	public String displaySearch() {
		String url = "www.yash.com/searchdata/search.jsp";
		String file = url.substring(url.lastIndexOf('/') + 1, url.lastIndexOf('.'));

		System.out.println(file);

		return file;
	}

	public static void main(String args[]) throws Exception {
		Q3_TestClass test = new Q3_TestClass();

		test.displayIndex();
		test.displaySalary();
		test.displaySearch();
	}

}
