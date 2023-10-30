package com.javabasic.ch13;

import javax.swing.JOptionPane;

class Ex13_9 {
	public static void main(String[] args) throws Exception {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();

		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		System.out.println("입력하신 값은 " + input + "입니다.");
		th1.interrupt();  // interrupt()를 호출하면, interrupted상태가 true가 된다.
		System.out.println("isInterrupted():"+ th1.isInterrupted()); // true
//		System.out.println("isInterrupted():"+ Thread.isInterrupted()); // true
//		Cannot make a static reference to the non-static method isInterrupted() from the type Thread
//		isInterrupted()는 리셋하지 않고 상태의 여부만을 확인하기 때문에 매개변수 그대로 사용할 수 있다
//		isInterrupted()는 특정 쓰레드 객체에서 호출해야하며, static(정적)으로 호출할 수 없다.
		
		System.out.println("interrupted():"+ Thread.interrupted()); // false
//		interrupted()는 정적 메서드이기 때문에 static인 Thread를 꼭 사용하여야 한다.
		
		
		
		
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<2500000000L;x++); // 시간 지연
		}
		System.out.println("카운트가 종료되었습니다.");
	} 
}
