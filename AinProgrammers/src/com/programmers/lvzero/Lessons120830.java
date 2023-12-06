package com.programmers.lvzero;

public class Lessons120830 {
	 public int solution(int n, int k) {
		int ram = 12000;
		int soda = 2000;
		return (ram*n)+(soda*k)-(Math.round(n/10)*soda);
	 }
}
