package com.programmers.lvone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lessons86051 {
    public int lessons86051(int[] numbers) {
    	 int answer = 0;
         List<Integer> list = new ArrayList<>();

         for (int a : numbers) {
             list.add(a);
         }
         Collections.sort(list);
        
         for (int i = 0; i <= 9; i++) {
            answer += list.contains(i) ? 0 : i;
         }
         return answer;
     }
    
    // 다른 사람의 풀이
    public int lessons286051(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

 }
