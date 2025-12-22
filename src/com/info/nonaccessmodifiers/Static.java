package com.info.nonaccessmodifiers;

public class Static {
	
	//static variable
	
	static int count;
	
	int variable = 24;	//instance variable
	
	//static block
	
	static {
		
		count = 20;
		
		//variable = 24;
		
		System.out.println("display the static variable count:"+count);
		
	}
	
	//static method
	
	static void display(){
		System.out.println("display the static method with count:"+count);
		
	
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("printing the main method");
		
		display();
		

	}

}
