package com.programmers.lvzero;

import java.util.Arrays;

public class Lessons12817 {
    public double lessons12817(int[] numbers) {
        double sum = 0;
//        정수 값인 int를 사용하면 반올림을 해버린다. 따라서 double형을 사용해야 정확한 소수점의 값이 나온다.
//        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
        	sum += numbers[i];
        }
        return sum / numbers.length ;
    }
    
    // 스트림을 사용한 다른 사람의 풀이
    public double lessons212817(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
//     .orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
    }
}
