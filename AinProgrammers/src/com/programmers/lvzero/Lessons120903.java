package com.programmers.lvzero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Lessons120903 {
    public int lessons120903(String[] s1, String[] s2) {
        int answer = 0;
        String str = "";
        for(String a : s1) {
        	for( String b : s2)
        	if(a.equals(b)) {
        		answer++;
        	}
        }

        return answer;
    }
    // 다른 사람의 해쉬셋 풀이
    public int lessons2120903(String[] s1, String[] s2) {
    	Set<String> set = new HashSet<>(Arrays.asList(s1));
    	return (int)Arrays.stream(s2).filter(set::contains).count();
    }
    // 다른 사람의 스트림과 콜렉트 함수를 이용한 풀이
    public int lessons3120903(String[] s1, String[] s2)	{
    	return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}
