package com.lam;

import java.util.Arrays;
import java.util.List;

public class Lam {
	public class Lcol {
	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("John", "Alice", "Bob");
	        
	       
	        names.sort((s1, s2) -> s1.compareTo(s2));

	        System.out.println(names);
	    }
	}

}
