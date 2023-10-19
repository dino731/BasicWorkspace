package com.programmers.lvzero;

public class Lessons181936 {
	public int lessons181936(int number, int n, int m) {
        int answer = number %n == 0 && number %m == 0 ? 1:0;
        return answer;
    }
}
