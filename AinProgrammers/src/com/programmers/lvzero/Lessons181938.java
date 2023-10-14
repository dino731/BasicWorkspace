package com.programmers.lvzero;

public class Lessons181938 {
    public int lessons181938(int a, int b) {
        int answer = 0;
        int a1 = Integer.parseInt(""+a+b);
        int b1 = 2*a*b;
//        if(a1 == b1){
//            return a1;
//        }
        // 같은 경우의 값이 같기때문에 비교연산이 필요 없다.
        return answer = Math.max(a1,b1);
    }
    
    // 다른 사람 풀이
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
    }
}
