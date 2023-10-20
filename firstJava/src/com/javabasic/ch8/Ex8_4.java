package com.javabasic.ch8;

class Ex8_4 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);
		try {
			System.out.println(3);
			
//			System.out.println(0/0); //ArithmeticException 발생 실행문
			System.out.println(args[0]); //ArrayIdexOutOfBoundsException 발생 실행문
			
			System.out.println(4); 	// 에러가 발생한 다음의 실행문은 실행되지 않는다.
		} catch (ArithmeticException ae)	{       // ArithmeticException 예외 발생 // 산술, 캐스팅 또는 변환 작업에서 오류가 발생한 경우 throw되는 예외입니다.
			if (ae instanceof ArithmeticException) 
				System.out.println("true");	        // 예외 발생하여 true가 실행됨.
			System.out.println("ArithmeticException");
		} catch(ArrayIndexOutOfBoundsException Ie) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e){						//  모든 예외의 최고 조상. 모든 예외 처리 가능.
			System.out.println("Exception");	
		}	// try-catch의 끝
		System.out.println(6);
	}	// main메서드의 끝
}