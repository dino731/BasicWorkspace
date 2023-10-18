package com.javabasic.ch7;

class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		
		
		
		FireEngine fe2 = (FireEngine)car; // 조상 -> 자손으로 형변환
		Car car2 = (Car)fe2;              // 자손 -> 조상으로 형변환
		
//		car2.water();     //컴파일 에러, Car타입의 참조 변수로는 water()를 호출할 수 없다.
		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}
