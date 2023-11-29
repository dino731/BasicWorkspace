package com.programmers.lvzero;

public class Lessons120841 {
	public int lessons120841(int[] dot) {
        int answer = 0;
        return answer = (dot[0] > 0 && dot[1] > 0) ? 1
        				: (dot[0] < 0 && dot[1] > 0) ? 2
    					:(dot[0] < 0 && dot[1] < 0)? 3 :4;
        
    }
}
