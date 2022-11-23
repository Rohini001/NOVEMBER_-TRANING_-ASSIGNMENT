package com.example.assigment.oops;

public class Finalize {

	public static void main(String[] args) {
		Finalize obj = new Finalize();   
	        System.out.println(obj.hashCode());   
	        obj = null;   	        
	        System.gc();    // calling garbage collector   
	        System.out.println("end of garbage collection");   
	  
	    }   
	      
	    protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
	
}
