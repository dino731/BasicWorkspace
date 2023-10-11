package com.programmers.lvzero;

import java.util.Scanner;

public class Lessons181949 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		String result = "";
		for(int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			}else {
				result += Character.toUpperCase(c);
			}
		}
		System.out.println(result);

	}

}


// 다른 사람들이 푼 문제 
class Solution181949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";

		// 향상된 for문을 사용했다는 점이 나와 다르다
		// 가독성이 좋고 간편해서 좋은 것 같다.
		for(Character c : a.toCharArray()){
			if(Character.isUpperCase(c)){
				answer += Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)){
				answer += Character.toUpperCase(c);
			}
		} 
		System.out.println(answer);
	}
}

// 아스키코드를 사용한 경우
class Solution2181949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			if(Character.isUpperCase(c)) {
				System.out.print((char)(c+32));
			}
			else {
				System.out.print((char)(c-32));
			}
		}
	}
}
