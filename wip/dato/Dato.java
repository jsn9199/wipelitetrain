package com.wip.dato;

import java.lang.reflect.Constructor;

public class Dato {
	 static String companyName = "Wipro";
	    int age;
	    String name;

	    public Constructor() {
	        this.age = 18;
	        this.name = "Default Name";
	    }

	    public Constructor(String name) {
	        this.age = 18;
	        this.name = name;
	    }

	    public Constructor(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }

	    public Constructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void displayDetails() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Company: " + Constructor.companyName);
	    }

	    public static void main(String[] args) {
	        Constructor emp1 = new Constructor();
	        Constructor emp2 = new Constructor("Ariys");
	        Constructor emp3 = new Constructor(21, "Vara");
	        Constructor emp4 = new Constructor("Prabhas", 30);;
	        emp1.displayDetails();
	        emp2.displayDetails();
	        emp3.displayDetails();
	        emp4.displayDetails();
	    }
	}


}
