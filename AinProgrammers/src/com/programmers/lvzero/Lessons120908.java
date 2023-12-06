package com.programmers.lvzero;

public class Lessons120908 {
	public int solution(String str1, String str2) {
//		equals는 문자열 전체를 한 단어로 검사하고 contains는 문자열안에 포함된 단어를 찾는다
//	    return str1.equals(str2) ? 1:2;
	    return str1.contains(str2) ? 1:2;
	    
//	    아래는 다른 사람의 풀이
//	    return str1.matches("(.*)" + str2 + "(.*)") ? 1 : 2;
	}
}
