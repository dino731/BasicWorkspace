package com.javabasic.ch14;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
		Optional<String> opt = Optional.empty();
		System.out.println("opt="+opt);
		
		String str = "";
		
		try {
			str = opt.get();
		} catch (Exception e) {
			 str = "";
		}
		
		str = opt.orElse("EMPTY");
//		str = opt.orElseGet(()-> new String());
		System.out.println("str="+str);
	}

}
