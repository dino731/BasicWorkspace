package com.programmers.lvone;

public class Lessons12916 {
    boolean lessons12916(String s) {
        String lowerS= s.toLowerCase();
        String p = "";
        String y = "";
        for(int i = 0; i < lowerS.length(); i++) {
        	char charS = lowerS.charAt(i);
        	p += (charS == 'p') ? charS : "";
        	y += (charS == 'y') ? charS : "";
        }
        boolean answer = (p.length()== y.length())? true: false;
        return answer;
    }
    // 다른 사람의 풀이. 람다식 활용
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}

