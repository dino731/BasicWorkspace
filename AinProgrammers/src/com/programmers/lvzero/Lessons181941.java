package com.programmers.lvzero;

// 내가 풀은 문제 (문자 리스트를 문자열로 변환하기)
class Lessons181941 {
    public String solution(String[] arr) {
        String answer = "";
        for( String a : arr ){
            answer += a;
        }
        return answer;
	}
}

// 다른 사람의 한 줄로 문제 해결 방식 (문자 리스트를 문자열로 변환하기)
class Solution181941 {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}


// 내가 풀은 문제 (문자열 곱하기)
class Lessons181940 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }
}

//다른 사람의 (문자열 곱하기)
// repeat() 메서드로 간편하게 문자열을 반복시킨 코드
class Lessons2181940 {
 public String solution(String my_string, int k) {
	 return my_string.repeat(k);
 }
}