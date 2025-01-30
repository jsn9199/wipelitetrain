package com.wip.dato;

import java.util.ArrayList;
import java.util.Iterator;

public class ITR {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

       

        Iterator<Integer> itr= list.iterator();

        while (itr.hasNext()) {
            Integer element = itr.next();
            if (element == 30) {
                itr.remove();
            }
            System.out.println(element);
        }
        System.out.println(list);
}
}
