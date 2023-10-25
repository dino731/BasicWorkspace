package com.programmers.lvzero;

public class Lessons120829 {
	// 나의 풀이
	// 삼항연산자로는 너무 복잡할 거 같아서 if~else if문을 사용했는데 아쉽다
    public int lessons120829(int angle) {
    	int result = 0;
   	
        if(0< angle && angle < 90) {
        	return result = 1;
        }else if(angle == 90) {
        	return result = 2;
        }else if(90 < angle && angle < 180 ) {
        	return result = 3;
        }else {
        	return result = 4;
        }
    }
    // 다른 사람 풀이 (삼항 연산자 활용)
    public int lessons2120829(int angle) {
        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}

