package com.programmers.lvone;

class Lessons12948 {
	public String lessons12948(String phone_number) {
	    String answer = "";
	    int index = 0;
	    for(int i =0; i < phone_number.length()-4; i++) {
	    	answer += '*';
	    	index++;
	    }
	    
	    return answer += phone_number.subSequence(index, index+4);
	}
	// 다른 사람 풀이
	 public String lessons212948(String phone_number) {
	    return phone_number.replaceAll(".(?=.{4})", "*");
	  }

}
