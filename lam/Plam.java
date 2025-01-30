package com.lam;

import java.util.function.Consumer;
import java.util.function.Function;

public class Plam {
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * Consumer<String> Message = message -> System.out.println(message);
	 * 
	 * 
	 * Message.accept("Hello, Lambda!");     }
	 */
		  public static void main(String[] args) {
		       
		        Function<String, Integer> strlen = str -> str.length();

		        System.out.println(strlen.apply("Bahubali"));
		    }
		}
}

