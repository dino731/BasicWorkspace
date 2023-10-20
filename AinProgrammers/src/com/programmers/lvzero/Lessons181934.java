package com.programmers.lvzero;

import java.util.Map;
import java.util.function.BiFunction;

class Lessons181934 {
	// 첫번째 시도 (실패)
	// 결과 값이 아닌 문자의 값이 담겨서 오류가 남
    public int lessons181934(String ineq, String eq, int n, int m) {
        int answer = Integer.valueOf(n+ineq.replaceAll("^\"|\"$","")+eq.replaceAll("^\"|\"$","")+m);
        return answer;
    }
    
    // 두번째 시도(성공)
    public int lessons2181934(String ineq, String eq, int n, int m) {
        int answer = 0;
        String a = ineq.replaceAll("^\"|\"$","")+eq.replaceAll("^\"|\"$","");
        if(a.equals(">=")) {
        	answer = n >= m ?  1:0;
        }else if(a.equals("<=")){
        	answer = n <= m ?  1:0;
        }else if(a.equals(">!")){
        	answer = n > m ?  1:0;
        }else if(a.equals("<!")){
        	answer = n < m ?  1:0;
        }
        return answer;
    }
    
    // 다른 사람 풀이 Map 사용
    public int solution(String ineq, String eq, int n, int m) {
        Map<String, BiFunction<Integer, Integer, Boolean>> functions = Map.of(
                ">=", (a, b) -> a >= b,
                "<=", (a, b) -> a <= b,
                ">!", (a, b) -> a > b,
                "<!", (a, b) -> a < b
                //비교 연산자와 해당 비교 연산을 수행하는 함수를 연결합니다. 
                // Map.of : java9부터 도입됨. 각 연산자와 해당 연산을 수행하는 함수를 지정합니다.
        );

        return functions.get(ineq + eq).apply(n, m) ? 1 : 0;
        	// 입력된 ineq와 eq를 결합하여 적절한 함수를 함수 맵에서 찾습니다. 
        	// 그런 다음 apply 메서드를 사용하여 이 함수에 n과 m을 적용하여 비교 연산을 수행합니다.
    }

}
