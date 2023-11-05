package com.programmers.lvone;

import java.util.Arrays;
import java.util.Collections;

class Lessons135808 {
	// 나의 풀이.
    public int lessons135808(int k, int m, int[] score) {
//    	(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8
//    	사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score
        int answer = 0;
        Integer[] s = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(s, Collections.reverseOrder());
        int sNum = s.length / m;
        int[][] iArr = new int[sNum][m];
        int index = 0;

        for (int i = 0; i < sNum; i++) {
            for (int j = 0; j < m; j++) {
                iArr[i][j] = s[index];
                index++;
            }
        }

        int[] result = new int[sNum];
        for (int i = 0; i < sNum; i++) {
            Arrays.sort(iArr[i]);
            result[i] = iArr[i][0];
        }

        for (int i = 0; i < result.length; i++) {
            answer += result[i] * m;
        }

        return answer;
    }
    
    // 다른 사람 풀이.
    public int lessons2135808(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);
        //for 루프는 점수 배열을 뒤에서부터 순회합니다. 루프의 초기값은 score.length로 설정되며, 루프가 m씩 감소하면서 실행됩니다.
        for(int i = score.length; i >= m; i -= m){
        	//루프 내부에서는 상자 크기 m에 해당하는 점수를 가져와 answer에 더합니다. 
        	//이를 통해 최대 점수를 얻기 위해 사용할 수 있는 최대 점수가 계산됩니다.
            answer += score[i - m] * m;
        }

        return answer;
    }
    
  
    
    public static void main(String[] args) {
    	Lessons135808 l = new Lessons135808();
    	int k = 5;
    	int m = 5;
    	int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        int result = l.lessons135808(k, m, score);
        int result = l.lessons2135808(k, m, score);
    	System.out.println(result);
    }
}
