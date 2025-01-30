package com.ops;

public class B extends Encaps {
	 int age;

	    B(String name, int age) {
	        super(name);
	        this.age = age;
	    }

	    void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

}
