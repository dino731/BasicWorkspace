package com.programmers.lvone;

public class Lessons76501 {
    public int lessons76501(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i] == false) {
        		absolutes[i] = absolutes[i]*-1;
        	}
        	answer += absolutes[i];
        }
        return answer;
    }
    
    // 다른 사람 풀이
    // 삼항연산자 사용 코드가 간결해서 가져옴
    public int lessons276501(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
