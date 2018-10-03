package com.cg.project.collectionsdemo;

import java.util.HashSet;

import com.cg.project.beans.Associate;

public class SetClassesDemo {
	public static void HashSetClass(){
	HashSet<Associate>associateSet = new HashSet<>();
	associateSet.add(new Associate(103, 15000, "Pankush"));
	associateSet.add(new Associate(102, 25000, "ankush"));
	associateSet.add(new Associate(101, 35000, "nkush"));
	associateSet.add(new Associate(104, 45000, "kush"));
	
	//System.out.println(associateSet.contains(103));
	
	for (Associate associate : associateSet) {
		System.out.println(associate);
	}
}
	public static void main (String[] args) {
		HashSetClass();
	}
}