package com.programmers.lvone;

import java.util.Arrays;

// 내가 풀이한 코드
class Lessons12944 {
    public double lessons12944(int[] arr) {
        double answer = 0;
        double sum = 0.0;
        for(double a : arr) {
        	sum += a;
        }
        return answer = sum / arr.length;
    }
    
    // 다른 사람의 풀이.  한줄로 끝내는 코드
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
        // java버전이 1.8 이상인 경우 Stream API에서 제공하는 배열을 스트림으로 변환할 수 있다.
        // 기본 타입의 배열은 Array 클래스의 stream() 메서드를 사용하여 스트림을 변환할 수 없었지만 
        // 1.8버전 이후 java.util.stream 패키지에서 제공하는 세가지 클래스를 사용하여 기본 타입의 배열을 스트림으로 변환할 수 있습니다.
        // IntStream : int 타입의 스트림
        // DoubleStream : double 타입의 스크림
        // LongStream : Long 타입의 스트림
       
    }
}

