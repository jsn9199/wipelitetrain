package com.wip.dato;

public class ARRAY {
		public static void main(String[] args) {
			int x[] = {10,20,30};
			for (int i=0;i<x.length;i++) {
				System.out.println(x[i]);
			}
			for(int y : x) {
				System.out.println(y);//cannot track the index values
			}
		}
	
}
