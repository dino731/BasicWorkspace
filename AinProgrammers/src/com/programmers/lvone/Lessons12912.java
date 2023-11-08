package com.programmers.lvone;

public class Lessons12912 {
	// 나의 풀이 (성공)
    public long lessons12912(int a, int b) {
        long answer = 0;
        if(a >= b) {
        	for(int i = b; i <= a; i++) {
        		answer += i;
        	}
        }else {
        	for(int i = a; i <= b; i++) {
        		answer += i;
        	}
        }
        return answer;
    }
}
// 다른 사람 풀이.
// 등차수열의 합 공식 사용.
class Lessons212912 {
    public long lessons212912(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}

// 다른 사람 풀이
// 삼항연산자를 for문안에 사용
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}
