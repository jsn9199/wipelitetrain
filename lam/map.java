package com.lam;

import java.util.HashMap;
import java.util.Map;

public class map {
		 public static void main(String[] args) {
		        Map<Integer, String> map = new HashMap<>();

		        map.put(1, "Apple");
		        map.put(2, "Banana");
		        map.put(3, "Cherry");

		        System.out.println("Value for key 1: " + map.get(1));

		        for (Map.Entry<Integer, String> entry : map.entrySet()) {
		            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }

		        System.out.println("Contains key 2? " + map.containsKey(2));

		        map.remove(2);

		        System.out.println("Updated Map: " + map);
		    }
	

}
