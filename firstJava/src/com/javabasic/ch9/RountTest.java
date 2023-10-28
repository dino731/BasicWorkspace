package com.javabasic.ch9;

import java.util.ArrayList;

public class RountTest {

	public static void main(String[] args) {
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10)); // 위와 동일
		System.out.println("i="+Integer.parseInt("100",2));
		System.out.println("i="+Integer.parseInt("FF",16));
//		System.out.println("i="+Integer.parseInt("FF"));  //NumberFormatException
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(100)); // list에는 객체만 추가 가능
		list.add(100); 				// JDK1.5이전에는 에러.
		
		int i = list.get(0);  //intValue()로 integer를 int로 변환
		System.out.println(list);

	}

}
