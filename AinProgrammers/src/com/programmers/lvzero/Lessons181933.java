package com.programmers.lvzero;

class Lessons181933 {
	// 나의 풀이 
    public int lessons181933(int a, int b, boolean flag) {
    	int answer = flag == true ? a+b : a-b;
        return answer;
    }
    
    // 다른 사람의 더 간단한 풀이
    public int lessons2181933(int a, int b, boolean flag) {
    	return flag ? a+b : a-b;
    }

}
