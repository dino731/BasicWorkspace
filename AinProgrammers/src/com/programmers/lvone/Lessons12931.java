package com.programmers.lvone;

public class Lessons12931 {
	public int lessons12931(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        
        for(int i = 0; i<a.length(); i++) {
        	answer += a.charAt(i)-48;
        	// 아스키 코드를 활용 49는 1을 뜻한다.
        }

        return answer;
    }
}
