package com.cjc.bank;

public class Test {

	public static void main(String args[]) {
		
		Bank b=new Bank();
		     b.setId(101);
		     b.setName("HDFC");
		     b.setUsername("hdfc123");
		     b.setPassword("hdfc@123");
		     
		Bank b1=new Bank();
	         b1.setId(201);
	         b1.setName("SBI");
	         b1.setUsername("SBI123");
	         b1.setPassword("SBI@123");
	     
	   System.out.println("Enter employee detail");
	         
	          b.getId();
	          b.getName();
	          b.getUsername();
	          b.getPassword();
	          
	          
	          b1.getId();
	          b1.getName();
	          b1.getUsername();
	          b1.getPassword();
	}
}
