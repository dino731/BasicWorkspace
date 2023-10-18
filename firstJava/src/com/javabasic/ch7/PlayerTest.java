package com.javabasic.ch7;

abstract class Player{
	abstract void play(int pos);
	abstract void stop(); 
}

// 추상 클래스는 상속을 통해 완성해야 객체를 생성할 수 있다
class AudioPlayer extends Player{
	void play(int pos) { System.out.println(pos+"위치부터 play합니다.");}
	void stop() { System.out.println("재생을 멈춥니다.");}
}

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
		//100위치부터 play합니다.
		//재생을 멈춥니다.
	}
}
