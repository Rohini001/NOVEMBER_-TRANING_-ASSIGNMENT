package com.example.assigment.oops;

 abstract class CalcAbs {
	void sum(int a, int b) {
	System.out.println("CalcAbs sum method :"+ (a+b) );	
	}

	void sub(int a, int b) {
		System.out.println("CalcAbs sum method :"+ (a-b) );	
	}

	void mul(int a, int	b) {
		System.out.println("CalcAbs sum method :"+ (a*b) );	
	}

	void div(int a,int b) {
		System.out.println("CalcAbs sum method :"+ (a/b) );		
	}
}

class A extends CalcAbs{
	void sum(int a, int b) {
		System.out.println("Class A sum method :"+ (a+b) );	
		}
}

class B extends A{
	void sub(int a, int b) {
		System.out.println("Class B sub method :"+ (a-b) );	
	}
}

class C extends B{
	void mul(int a, int	b) {
		System.out.println("Class mul method :"+ (a*b) );	
	}

}
public class D extends C{
	void div(int a,int b) {
		System.out.println("Class div method :"+ (a/b) );		
	}
	
	public static void main(String[] args) {
		D d= new D();
		d.sum(4, 5);
		d.sub(5, 4);
		d.mul(2, 3);
		d.div(10, 5);
	}
}
