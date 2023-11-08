package com.programmers.lvone;

public class Lessons12934 {
	// 나의 풀이 (실패. 시간초과)
    public long lessons12934(long n) {
        long answer = 0;
        int sum = 0;
        int result = 0;
        for(int i = 0; i <= n; i++) {
        	sum = i;
        	if(sum*sum == n) {
        		return result = (sum + 1)*(sum + 1);
        	}
        }
        return answer = (result == n)? result : -1;
    }
    
    // 구글링. 다른 사람의 풀이
    // 함수를 알아보는 과정에서 발견한 풀이
    // Math.sqrt() 인수에 대한 double타입의 제곱근 값을 리턴
    // Math.pow() 인수에 대한 제곱을 계산하는 함수
    public long lessons212934(long n) {
        double sqrt = Math.sqrt(n);
        long num = (long) sqrt;
        return num == sqrt ? (long)Math.pow(sqrt + 1, 2) : -1;
    }
}
