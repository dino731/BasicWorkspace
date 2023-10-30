package com.javabasic.ch14;

public class Ex14_0 {

	public static void main(String[] args) {
//		MyFunction obj = new MyFunction() {
//			public int max(int a, int b) {   // 오버라이딩 - 접근 제어자는 좁게 못바꾼다 (반드시 public 써줘야 한다)
//				return a > b ? a:b;
//			}
//		};
		
		// 람다식을 다루기 위한 참조 변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 obj = (a,b) -> a > b ? a : b;  // 람다식. 익명 객체
		
		int value = obj.max(3,5); // 함수형 인터페이스
		System.out.println("value = "+value);
	}

}
//함수형 인터페이스 생성
@FunctionalInterface   // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 한다.
interface MyFunction2{
	public abstract int max(int a, int b);
}
