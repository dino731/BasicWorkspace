package com.programmers.lvzero;

import java.util.Arrays;

// 첫번째 풀이 (성공)
public class Lessons120824 {
    public int[] lessons120824(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++) {
        	if(num_list[i] % 2 == 0) {
        		even++;
        	}else {
        		odd++;
        	}
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
    
    // 두번째 풀이
    // 스트림을 이용한 방법
    // 최대한 한줄로 풀고 싶어서 구글링해서 알아보다가 찾음
    public int[] lessons2120824(int[] num_list) {
        return new int[] {
        		(int) Arrays.stream(num_list).filter(e -> e % 2 == 0).count(),
        		(int) Arrays.stream(num_list).filter(e -> e % 2 != 0).count()
        };
    }
    
    // 다른 사람의 풀이
    // 이건 봐도 봐도 모르겠다.. 진짜 대단하네
    public int[] lessons3120824(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
        return answer;
    }
}
