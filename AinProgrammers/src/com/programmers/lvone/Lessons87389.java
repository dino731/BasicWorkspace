package com.programmers.lvone;

import java.util.stream.IntStream;

public class Lessons87389 {
    public int lessons87389(int n) {
        int answer = 0;
        for(int i = 1; i < n; i++) {
        	if(n%i ==1) {
        		return answer = i;
        	}
        }
        return answer;
    }
    // 다른 사람 풀이. Stream을 사용한 방법
    public int lessons287389(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}
