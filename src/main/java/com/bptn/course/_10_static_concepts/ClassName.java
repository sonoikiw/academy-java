package com.bptn.course._10_static_concepts;

public class ClassName {
	
	//declare a static variable
	static int staticVariable=100 ;
	
	//declare an instance variable
	int instanceVariable ;
	
	//declare a static method
	static void staticMethod() {
		
		System.out.println("Static method is called..");
		
		//can I access an instance variable ?
		
		//can I access an instance method?
	}
void instanceMethod() {
	System.out.println("Instance method is called..");
	
	//can i access a static variable within an instance method
	System.out.println("Static variable :"+ staticVariable);
	
	//can I access a static method within an instance method
	staticMethod();
}

        
     
	public static void main(String[] args) {
		
		ClassName c1 =new ClassName();
		c1.instanceMethod();
		
		//Access the static Variable
		System.out.println("Static cariable :" + staticVariable);
		
		staticMethod();

	}

}
//major key takeaways
//1. we cannot access instance variable or methods within a static method
//2. We can access static variables and static methods within an instance 
