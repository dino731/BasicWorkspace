package com.javabasic.ch7;

class Time{
	private int hour;	// 0~23사이의 값을 가져야 한다.
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
			this.hour = hour;
	}
	
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0|| hour > 23;
	}
	
	public int getHour() {return hour;}
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		t.setHour(23);
		System.out.println(t.getHour());
		t.setHour(1);
		System.out.println(t.getHour());
		t.setHour(25);
		System.out.println(t.getHour());
		// 25는 유효성 검사에서 통과되지 않아서 set되지 않음 따라서 마지막 set 값인 1이 출력됨.
	}

}
