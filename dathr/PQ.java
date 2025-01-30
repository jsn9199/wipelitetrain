package com.dathr;

import java.util.PriorityQueue;

public class PQ {
	
		public static void main(String[] args) {
	        PriorityQueue<Integer> pq= new PriorityQueue<>();
	        
	        pq.add(30);
	        pq.add(20);
	        pq.add(50);
	        pq.add(10);
	        pq.add(40);

	      
	        System.out.println( pq);
	        System.out.println( pq.peek());
	        System.out.println(pq.poll());
	        System.out.println(pq);

	       
	        for (Integer num : pq) {
	            System.out.println(num);
	        }
	    }
	}

