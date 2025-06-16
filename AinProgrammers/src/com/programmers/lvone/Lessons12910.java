package com.programmers.lvone;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lessons12910 {
	// 첫번째 풀이 (실패)
	// 원인 : answer 초기화 때문에 오류..
//    public int[] lessons12910(int[] arr, int divisor) {
//        int[] answer = {};
//        int iNum = 0;
//        int count = 0;
//        for(int i = 0; i < arr.length; i++) {
//        	iNum = arr[i];
//        	if(iNum % divisor == 0) {
//        		count++;
//        		answer[count] += arr[i];
//        	}
//        }
//        return answer ;
//    }
    // 두번째 풀이(성공)
    public int[] lessons212910(int[] arr, int divisor) {
        int[] answer = {};
        IntStream arrStream = Arrays.stream(arr);
        
    	// return answer = arrStream.filter( e -> e % divisor == 0).forEach( e -> System.out::println(e));
        // forEach 메서드는 반환 값이 없기 때문에 filter와 함께 사용할 때 문제가 발생한다.
        
        // return answer = arrStream.filter( e -> (e % divisor == 0)? e : -1).sorted().toArray();
        // filter는 boolean으로 결과를 반환한다. 따라서 조건식의 결과는 boolean이어야 한다.
        
        // orElse(-1)를 사용해보려고 했는데 orElse는 Optional 객체에서 사용할 수 있는 메서드이다. 따라서 IntStream에서는 불가.
        
        // 한줄로 하고 싶었는데 쉽지 않다..
        int [] result = arrStream.filter( e -> e % divisor == 0).sorted().toArray();
        return answer = (result.length == 0 ) ? new int[] {-1} : result ;

        //2025.06.16.15:57 inteellij Git 업로드 테스트
        //왜 체인지가 안뜨지???

        
    }
}
