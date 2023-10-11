package com.programmers.lvzero;
import java.util.Scanner;

public class Lessons181950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println(str.repeat(n));
		// repeat : 문자열 반복 메서드
		// 자바 11에서 새로 추가된 String 메서드이다.
	}
}

// 내가 풀이 한 문제
class Solution181950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result ="";
        for(int i=0; i<n; i++){
            result += str;
        }
        System.out.println(result);
    }
}
