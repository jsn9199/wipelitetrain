package com.wip.dato;

public class CAO {
	 int Age = 21;
	 String Name = "Lokesh";
	 static String place= "chennai" ;
	 
	 void greet(){
		 System.out.println("My name is " + Name+ "  My age is " + Age + ".iam from "+ CAO.place);
	 }
	 
	 public static void main(String[] args) {
		 CAO obj1 = new CAO();
		 obj1.greet();
		 
	 }
}

}
