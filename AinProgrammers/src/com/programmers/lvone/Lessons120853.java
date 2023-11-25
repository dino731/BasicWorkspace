package com.programmers.lvone;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
import java.util.Stack;

class Lessons120853 {
	//첫번째 실패
//	public int lessons120853(String s) {
//		int answer = 0;
//        char[] cNum = s.toCharArray();
//        for(int i = 0; i < cNum.length; i++) {
//        	answer += Character.getNumericValue(cNum[i]);
//        	if(cNum[i] == 'Z') {
//            	answer -= Character.getNumericValue(cNum[i]);
//    			answer -= Character.getNumericValue(cNum[i-1]);
//        	}
//        }
//        return answer;
//	}
	//두번째 실패
//	public int lessons2120853(String s) {
//		int answer = 0;
//	    char[] cNum = s.toCharArray();
//	    for(int i = 0; i < cNum.length; i++) {
//	    	answer += Integer.valueOf(cNum[i]);
//	    	if(cNum[i] == 'Z') {
//	        	answer -= Integer.valueOf(cNum[i]);
//				answer -= Integer.valueOf(cNum[i-1]);
//	    	}
//	    }
//	    return answer;
//	}
	//세번째 실패
//	public int lessons3120853(String s) {
//		int answer = 0;
//		String[] sArr = s.split(" ");
//		List<String> sList = new ArrayList<>(Arrays.asList(sArr));
//		for(int i = 0; i < sList.size(); i++) {
//			if(sArr[i].equals("Z")) {
//				sList.remove(i);
//				sList.remove(i-1);
//				i--;
//			}
//		}
//		for(String str : sList) {
//			answer += Integer.valueOf(str);
//		}
//		return answer;
//	}
	// 네번째 성공
	// 너무 복잡하게 생각하지 말자.. 필요한 것만 담고 필요 없는건 담지 않으면 된다.
	public int lessons4120853(String s) {
		int answer = 0;
		String[] sArr = s.split(" ");
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].equals("Z")) {
				answer -= Integer.valueOf(sArr[i-1]);
			}else{
                answer += Integer.valueOf(sArr[i]);
            }
		}
		return answer;
	}
	// 다른 사람의 풀이 stack을 활용
	 public int lessons5120853(String s) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>();

	        for (String w : s.split(" ")) {
	            if (w.equals("Z")) {
	                stack.pop();
	            } else {
	                stack.push(Integer.parseInt(w));
	            }
	        }
	        for (int i : stack) {
	            answer += i;
	        }
	        return answer;
	    }
	
	public static void main(String[] args) {
		Lessons120853 l = new Lessons120853();
    	String s = "10 Z 20 Z 1";

        int result = l.lessons4120853(s);
    	System.out.println(result);
    }
	
}
