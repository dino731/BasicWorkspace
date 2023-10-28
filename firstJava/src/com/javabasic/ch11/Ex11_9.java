package com.javabasic.ch11;

import java.util.*;

class Ex11_9 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();

		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]+"="+set.add(objArr[i]));	// HashSet에 objArr의 요소들을 저장한다.
		}
                // HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);	

		// HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		// hasNext 읽어올 요소가 남아있는지 확인
		while(it.hasNext()) {
			System.out.println(it.next());	
			// 요소 하나 꺼내오기 next()
		}
	}
}