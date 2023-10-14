package com.javabasic.ch7;

final class FinalTest{        		 // 조상이 될 수 없는 클래스
	final int MAX_SIZE = 10;     	 // 값을 변경 할 수 없는 멤버변수(상수)
		
//	final void getMaxSize() {    	 // 오버라이딩 할 수 없는 메서드(변경불가)
//		final int LV = MAX_SIZE;	 // 값을 변경 할 수 없는 지역상수(상수)
//		return MAX_SIZE;
		// void로 명시되어있으면 반환 값이 있으면 안된다.
		// 따라서 MAX_SIZE를 return하고 싶다면 void대신 int를 넣어 반환되는 데이터 타입을 맞춰줘야한다.
//	}
	
	final int getMaxSize() {    	 
		final int LV = MAX_SIZE;	
		return MAX_SIZE;
	}

}
