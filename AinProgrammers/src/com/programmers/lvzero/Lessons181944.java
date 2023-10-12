package com.programmers.lvzero;

import java.util.Scanner;

// 홀수 짝수 구분하기
// 나의 풀이
public class Lessons181944 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
	}
}

// 다른 사람의 삼항 연산자를 이용한 풀이
class Lessons2181944 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
	}
}
