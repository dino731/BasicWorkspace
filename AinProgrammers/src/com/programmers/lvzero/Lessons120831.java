package com.programmers.lvzero;

public class Lessons120831 {
    public int lessons120831(int n) {
    	int sum = 0;
    	// n-1의 값까지 검사를 하기 때문에 결과 값이 다르다.
        for(int i = 1; i < n; i++) {
        	if(i%2 == 0) {
        		sum += i;
        	}
        }
        return n+sum;
    }
    public static void main(String[] args) {
    	Lessons120831 T = new Lessons120831();
        System.out.println(T.lessons120831(9));
    }
}
// 두번째 도전(성공)
class Lessons120831two{
	public int solution(int n) {
		int sum = 0;
		// n까지 검사를 넣어주냐의 차이에 따라서 결과 값이 달라지기 때문에 다르다.
	    for(int i = 1; i <= n; i++) {
	    	if(i%2 == 0) {
	    		sum += i;
	    	}
	    }
	    return sum;
	}
}