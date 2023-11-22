package com.programmers.lvone;

import java.util.Arrays;


public class Lessons12935 {
	// 정렬하면 안돼서 실패
//  public int[] lessons12935(int[] arr) {
//        int[] answer = {};
//        Arrays.sort(arr);
//        return answer = (arr[0] == 10 ? new int[]{-1} : Arrays.copyOf(arr, arr.length - 1));
//    }
	// 스트림 연습겸 풀이
	  public int[] lessons12935(int[] arr) {
	        int minNum =  Arrays.stream(arr).min().getAsInt();
	        return (arr[0] == 10 ? new int[]{-1} : Arrays.stream(arr).filter(e -> e != minNum).toArray());
	    }
}
