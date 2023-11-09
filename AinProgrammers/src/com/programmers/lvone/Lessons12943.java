package com.programmers.lvone;

public class Lessons12943 {
//	public int lessons12943(int num) {
//        int answer = 0;
//        int result = num;
//        
//        for(int i = num; i > 1; i--) {
//            if(result % 2 == 0) {
//            	result = num / 2;
//            	answer++;
//                if(result % 2 != 0){
//                    result = 10;
//                    answer++;
//                }
//            }
//        }
//        return answer;
//	}
	
//	public int lessons12943(int num) {
//		int answer = 0;
////        int result = num;
//		if(num == 1) {
//			return 0;
//		}
//        
//        while(num != 1) {
//            if(num % 2 == 0) {
//            	num = num / 2;            	
//            	System.out.println("반복 횟수"+answer);
////                answer++;
//            }else{
//            	num = num * 3 + 1;
////	            answer++;
//	            System.out.println("홀수 result : "+ num);
//            }
//            answer++;
//            if(answer == 500){
//            	return -1;
//            }
//        }
//        System.out.println(num);
//        return answer;
//	}
	
	public int lessons12943(int num) {
		int answer = 0;
        long lNum = num;
        while(lNum != 1) {
            if(lNum % 2 == 0) {
            	lNum = lNum / 2;            	
            	System.out.println("반복 횟수"+answer);
            }else{
            	lNum = lNum * 3 + 1;
	            System.out.println("홀수 result : "+ lNum);
            }
            answer++;
            if(answer == 500){
            	return -1;
            }
        }
        System.out.println(lNum);
        return answer;
	}

// 다른 사람 풀이.
// 삼항연산자 사용
    public int collatz(int num) {
    long n = (long)num;
    for(int i=0; i<500; i++){
        if(n==1) return i; 
      n = (n%2==0) ? n/2 : n*3+1;
    }

        return -1;
    }
	
	

	public static void main(String[] args) {
		Lessons12943 l1 = new Lessons12943();
		int num = 626331;
		int result = l1.lessons12943(num);
		System.out.println(result);
	}
}
