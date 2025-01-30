package com.ops;

public class rideof {
	public class impl1 implements Vehicle {
	    private String make;
	    private String model;

	    public impl1(String make, String model) {
	        this.make = make;
	        this.model = model;
	    }

	    @Override
	    public void start() {
	        System.out.println(make + " " + model + " is starting.");
	    }

	    @Override
	    public void stop() {
	        System.out.println(make + " " + model + " is stopping.");
	    }

	    public static void main(String[] args) {
	        Vehicle myCar = new impl1("Toyota", "Camry");
	        myCar.start();
	        myCar.stop();
	    }
	}

}
