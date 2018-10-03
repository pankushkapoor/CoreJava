package com.cg.project.collectionsdemo;

import java.util.HashMap;

import com.cg.project.beans.Associate;

public class MapClassDemo {
	public static void hashMapDemo(){
		HashMap<Integer, Associate>associates = new HashMap<>();
		
		associates.put(103,new Associate(103, 15000, "Pankush")); 
		associates.put(101,new Associate(101, 25000, "Harshit"));
		associates.put(102,new Associate(102, 35000, "Aman"));
		
		System.out.println(associates.get(102));
	}
	public static void main (String[] args) {
		//MapClassDemo ob = new MapClassDemo();
		hashMapDemo();
	}
}
