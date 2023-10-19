package com.programmers.lvzero;

class Lessons181935 {
	// 첫번째 풀이 (실패)
	// 풀다보니 '}'줄이 안맞아서 일단 값이라도 나오게끔 수정하였다
 public int lessons181935() {
	 	int n = 7;
        int answer = 0;
        int result = 0;
        if(n%2 == 0){
            for(int i = 0; i < n; i++){
                result = i;
                if(result%2 == 0){
                   answer += result;
                }
            }
            return answer;
        }else {
        	for(int i = 0; i < n; i++){
                result = i;
                if(result%2 != 0){
                   answer += result;
                }
        	}
        	 return answer;
        	 
        }
    }
 // 두번째 풀이 (성공)
 // 홀수와 짝수를 구분하는 방법도 알겠고, 그안의 짝수 혹은 홀수를 각각 더해야하는 것도 알겠는데 너무 일차원적으로 푼게 아닌가..
 // 이 하드코딩을 어떻게 줄여서 효과적으로 만들 수 있을지 고민해보자
 public int lessons2181935(int n) {
     int answer = 0;
     if(n%2 == 0){
         for(int i = 0; i < n+1; i++){
                answer += i%2 == 0? i*i : 0;
         }
         return answer;
     }else {
         for(int i = 0; i < n+1; i++){
               answer += i%2 != 0? i : 0;
         }
          return answer;
     }
 }
 // 세번째 시도(성공)
 // 중복되는 코드를 줄였지만 큰 차이가 없어 보이고 미미하다
 public int lessons3181935(int n) {
     int answer = 0;
     int one = 0;
     int two = 0;
     for(int i = 0; i < n+1; i++){
         if(i%2==0){
             two += i*i;
         }else{
             one += i;
         }
     }
      return answer = n % 2 == 0 ? two : one;
 }
 // 네번째 시도(성공)
 // 불필요한 변수 사용을 줄이고 가독성이 개선되었다.
 public int lessons4181935(int n) {
     int answer = 0;
     for(int i = 0; i < n+1; i++){
         if(n%2==0){
        	 answer += i % 2 == 0 ? i*i : 0;
         }else{
             answer += i % 2 != 0 ? i : 0;
         }
     }
      return answer;
 }
}


