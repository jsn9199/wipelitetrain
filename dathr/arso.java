package com.dathr;

import java.util.SortedSet;
import java.util.TreeSet;

public class arso {
	
		public static void main(String[] args) {
	        SortedSet<Integer> sortedSet = new TreeSet<>();

	        sortedSet.add(40);
	        sortedSet.add(20);
	        sortedSet.add(60);
	        sortedSet.add(10);
	        sortedSet.add(30);

	        System.out.println(sortedSet);

	        System.out.println(sortedSet.first());
	        System.out.println(sortedSet.last());

	        SortedSet<Integer> headSet = sortedSet.headSet(40);
	        System.out.println(headSet);

	        SortedSet<Integer> tailSet = sortedSet.tailSet(30);
	        System.out.println(tailSet);

	        SortedSet<Integer> subSet = sortedSet.subSet(20, 60);
	        System.out.println(subSet);
	    }
	}


