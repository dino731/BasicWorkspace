package com.javabasic.ch11;

import java.util.*;

class Ex11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();
		// iterator은 1회용이라 다쓰고나면 다시 얻어와야 한다.

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			// false가 되면 더이상 읽어올 다음이 없기 때문에 반복문을 빠져나감
		}
	} // main
}