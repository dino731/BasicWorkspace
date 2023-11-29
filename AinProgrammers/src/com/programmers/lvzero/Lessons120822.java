package com.programmers.lvzero;

//import java.util.Arrays;
//import java.util.Collections;

public class Lessons120822 {
	// 첫번째 시도 실패
//	Arrays.asList(cArr)에서 배열을 리스트로 변환하는 방식은 배열의 요소를 직접 변경하는 것이 아니라 래퍼런스를 변경합니다. 
//	즉, 이 방식은 리스트의 내용을 바꾸는 것이 아니라 뷰(view)를 생성하며, 이 경우에는 수정이 불가능합니다.
//	따라서 Collections.reverse()로 뒤집어도 실제 배열의 순서가 바뀌지 않습니다. 대신에 Collections.reverse()는 List 타입의 객체에 대해서만 동작합니다.
//	 public String lessons120822(String my_string) {
//		 	String a = "";
//		 	char[] cArr = my_string.toCharArray();
//	        Collections.reverse(Arrays.asList(cArr));
//	        for(char c : cArr) {
//	        	a += c;
//	        }
//	        return a;
//	    }
	 public String lessons2120822(String my_string) {
		 	String a = "";
		 	char[] cArr = my_string.toCharArray();
		 	for(int i = cArr.length-1; i >= 0; i--) {
		 		a += cArr[i];
		 	}
	        return a;
	    }
	 //다른 사람의 풀이
	   public String lessons3120822(String my_string) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(my_string);
	        sb.reverse();

	        return sb.toString();
	    }
}
