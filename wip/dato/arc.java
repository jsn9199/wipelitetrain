package com.wip.dato;

import java.util.ArrayList;
import java.util.List;

public class arc {
	    public static void main(String[] args) {
	    	List<Object> list=new ArrayList<>() ;
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        System.out.println( list);
	        list.add(2, 25);
	        System.out.println(list);
	        System.out.println(list.get(3));
	        list.set(3, 35);
	        System.out.println(list);
	        list.remove(2);
	        System.out.println(list);
	        list.remove(Integer.valueOf(20));
	        System.out.println(list);
	        System.out.println(list.contains(30));
	        System.out.println(list.size());
	        System.out.println(list.isEmpty());
	        for (Object value : list) {
	            System.out.println(value);
	        }
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	        List<Object> newList = new ArrayList<>();
	        newList.addAll(list);
	        System.out.println(newList);
	        list.clear();
	        System.out.println(list);
	        System.out.println(list.isEmpty());
	    }

}
