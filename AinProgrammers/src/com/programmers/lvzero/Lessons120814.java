package com.programmers.lvzero;

public class Lessons120814 {
    public int lessons120814(int n) {
    	// int pizza로 했을때 인트끼리 나누면 소수점이 탈락되고 여기서 ceil을 해도 올림이 적용되지 않았다. 처음부터 double을 사용해주면 문제 없이 해결된다. n = 15일 경우.
    	double pizza = 7;
        double pan = Math.ceil(n/pizza);
        int reault = (int)Math.ceil(pan);
        return (reault < 1)? 1: reault;
    }
    // 다른 사람의 풀이
    public int lessons2120814(int n) {
        return (n + 6) / 7;
        // 댓글 : 정수론 잘하실 듯.. 6은 '어떤 수를 7로 나누면 나머지가 0부터 6까지만' 있어서 들어간 숫자에요.
    }
    // 삼항연산자 하다가 포기했는데 이렇게 가능하다.. 여러 방법으로 시도해보자
    public int lessons3120814(int n) {
        return (n%7==0) ? n/7 : n/7 + 1;
    }
}
