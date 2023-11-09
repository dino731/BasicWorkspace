package com.programmers.lvone;

import java.util.Arrays;
import java.util.Comparator;

public class Lessons12933 {
    public long lessons12933(long n) {
    	long answer = 0;
        String str = ""+n;
        String[] arr = str.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        
        String result = "";
        for(String s : arr) {
        	result += s;
        }

        return answer = Long.valueOf(result);
    }
}

class Lessons212933 {
	String res = "";

	public int reverseInt(int n) {
		res = "";
		Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
		return Integer.parseInt(res);
	}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Lessons212933 ri = new Lessons212933();
		System.out.println(ri.reverseInt(118372));
	}
}
