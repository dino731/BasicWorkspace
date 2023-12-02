package com.programmers.lvzero;

class Lessons120898 {
    public int lessons120898(String message) {
        int answer = 0;
        for(int i = 0; i<message.length(); i++) {
        	answer += i*2;
        }
        return answer;
    }
    public int lessons2120898(String message) {
        return message.length() * 2;
    }
}
