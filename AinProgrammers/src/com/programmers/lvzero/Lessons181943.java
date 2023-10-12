package com.programmers.lvzero;

// 실패
// 첫번째 시도 
class Lessons181943 {
    public String Lessons181943(String my_string, String overwrite_string, int s) {
        String answer = "";
        if(s == 2) {
        	String d = my_string.substring(0,2);
	        String f = my_string.substring(9,10);
        	return answer = d + overwrite_string + f;
        }else {
        	String t = my_string.substring(0,7);
        	answer = t + overwrite_string;
            return answer;
        }
	}
}
// 실패 
// 두번째 시도
//0 = (+7) 7 + ?
//1 = (+7) 8 + ? 
//2 = (+7) 9 + 1
//3 = (+7) 10 + ?
//4 = (+7) 11 + ?
//5 = (+7) 12 + ?
//6 = (+7) 13 + ?
//7 = (+7) 14
class Lessons2181943 {
    public String Lessons2181943(String my_string, String overwrite_string, int s) {
        String answer = "";
        return answer = my_string.substring(0,2)+ overwrite_string;
	}
}

// 성공 
// 세번째 시도
class Lessons32181943 {
    public String Lessons32181943(String my_string, String overwrite_string, int s) {
        String answer = "";
        int r = overwrite_string.length();
        return answer = 
                        my_string.substring(0,s)
                        + overwrite_string
                        +my_string.substring(s+r);
    }
}

// 다른 사람 참고 가독성 좋게
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}
