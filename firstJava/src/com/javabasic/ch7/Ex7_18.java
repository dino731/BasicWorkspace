package com.javabasic.ch7;

import java.awt.*;
import java.awt.event.*;


// 익명 클래스
public class Ex7_18 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {// 클래스의 정의와 객체 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
		
		// 똑같은 클래스가 아니라 일회성이기 때문에 다른 클래스이다.
		b.addActionListener(new ActionListener() {// 클래스의 정의와 객체 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}

