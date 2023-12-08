package com.programmers.lvzero;

public class Lessons120825 {
    public String lessons120825(String my_string, int n) {
    	char[] str = my_string.toCharArray();
    	String result = "";
        for(int i = 0; i<str.length; i++) {
            for(int j = 0; j <= n-1; j++){
                result += str[i];
            }
        }
        return result;
    }
    // 다른 사람 풀이 
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
