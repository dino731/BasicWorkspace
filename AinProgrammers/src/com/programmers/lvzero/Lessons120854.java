package com.programmers.lvzero;

class Lessons120854 {
//    public int[] lessons120854(String[] strlist) {
//        int[] answer = {};
//        String fullStr = "";
//        for(int i = 0; i < strlist.length; i++) {
//        	fullStr += strlist[i];
//        }
////        int count = 0;
//        String[] partArr = fullStr.split("");
//        for(int i = 0; i<partArr.length; i++) {
//        	if(partArr[i] != ",") {
////        		count++;
//        	}
//        	
//        }
//        return answer;
//    }
    public int[] lessons2120854(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
    public static void main(String[] args) {
    	Lessons120854 l = new Lessons120854();
    	String[] a = {"We", "are", "the", "world!"};
    	int[] result = l.lessons2120854(a);
    	 for (int value : result) {
             System.out.println(value);
         }
    }
}
