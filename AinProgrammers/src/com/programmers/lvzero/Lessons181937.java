package com.programmers.lvzero;

class Lessons181937 {
	// 첫 풀이
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
           return answer = 1;
        }else{
           return answer = 0;
        }
    }
    
    // 삼항연산자 활용
    public int solution2(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
    
    
    
}

