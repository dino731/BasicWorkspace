package com.programmers.lvone;

import java.util.stream.LongStream;

public class Lessons12954 {
	// 나의 풀이.
    public long[] lessons12954(int x, int n) {
    	 long[] answer = new long[n];
         for(int i = 0; i <n; i++) {
         	answer[i] += (long)x*(i+1);
         }
         return answer;
    }
    
    // 다른 사람의 풀이. stream사용한 방법
    public long[] lessons212954(int x, int n) {
        return LongStream.iterate(x, i->i+x).limit(n).toArray();
    }
    
    public static void main(String[] args) {
    	Lessons12954 test = new Lessons12954();
    	int x = 2;
    	int n = 5;
        long[] result = test.lessons12954(x, n);

        for (long num : result) {
            System.out.println(num);
        }

    }
}