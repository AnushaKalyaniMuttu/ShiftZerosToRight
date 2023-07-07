package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShiftZerosToRight {

	 public static void main(String [] args) {
	List<Integer> list=new ArrayList<>();
				list.add(1);
				list.add(2);
				list.add(0);
				list.add(3);
				list.add(4);
				list.add(0);
	long zeros=list.stream().filter(n->n==0).count();
	list=list.stream().filter(n->n!=0).collect(Collectors.toList());
	list.addAll(Stream.generate(()->0).limit(zeros).collect(Collectors.toList()));
	System.out.println(list);
	 }
}
