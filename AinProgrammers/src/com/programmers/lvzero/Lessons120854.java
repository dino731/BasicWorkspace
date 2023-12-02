package com.programmers.lvzero;

class Lessons120854 {
    public int[] lessons120854(String[] strlist) {
        int[] answer = {};
        String fullStr = "";
        for(int i = 0; i < strlist.length; i++) {
        	fullStr += strlist[i];
        }
        int count = 0;
        String[] partArr = fullStr.split("");
        for(int i = 0; i<partArr.length; i++) {
        	if(partArr[i] != ",") {
        		count++;
        	}
        	
        }
        return answer;
    }
    public int[] lessons2120854(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
        	if(strlist[i].equals(",")) {
        		answer[0] = i-3;
        	}
        }
        return answer;
    }
}
