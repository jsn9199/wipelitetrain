package com.ops;

public class Encaps {
	String name;

    Encaps(String name) {
        this.name = name;
    }

    void displayGreeting() {
        System.out.println("Hi, " + name + "! Welcome from Class A.");
    }


}
