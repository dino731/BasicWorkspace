package com.programmers.lvone;

public class Lessons12928 {
	// 첫번째 풀이 (성공) 약수의 합을 구하기 20231026
	public int lessons12928(int n){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
