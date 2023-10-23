package com.programmers.lvone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 첫번째 풀이 (실패)
// 값이 어떻게 나올지 테스트 삼았는데 제한시간 10초를 넘겨서 값을 볼 수 없었다.
class Lessons12938 {
	 public int[] lessons12938(int n, int s) {
		int[] answer = {};
        List<int[]> list = new ArrayList<>();
        
        for(int i = -1; i < 9; i++) {
        	for(int j = -1; j < 9; i++) {
        		if(i+j == s) {
        			list.add(new int[] {i,j});
        		}
        	}
        }
        return answer = list.get(0);
    }
	// 두번째 풀이 (실패)
	// 마찬가지로 10초를 넘겨서 값을 볼 수 없었다. 
	 // 원인 : j++에 i++를 넣어서... 첫번째도 마찬가지..
	 public int[] lessons212938(int n, int s) {
		int[] answer = new int[n];	
        int sum = 0;
        for(int i = -1; i < 9; i++) {
        	for(int j = -1; j < 9; i++) {
        		if(i+j == s) {
        			answer[sum]= i;
        			answer[sum]= j;
        		}
        	}
        }
        return answer;
    }
	 // 세번째 도전(실패)
	 // 이제 값이 나온다
    public int[] lessons312938(int n, int s) {
		 if(s<n) {
			 return new int[]{-1};
		 }
		int[] answer = new int[n];	
        int sum = 0;
        for(int i = 1; i < 5; i++) {
        	for(int j = 1; j < 8; j++) {
        		if(i+j == s) {
        			answer[sum]= i;
        			answer[sum]= j;
        		}
        	}
        }
        return answer;
    }
	 
	 // 네번째 도전(실패)
	public int[] lessons412938(int n, int s) {
		 if(s<n) {
			 return new int[]{-1};
		 }
		int[] answer = new int[n];	
		int key = 0;
		List<int[]> list = new ArrayList<>();
		
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i < 5; i++) {
        	for(int j = 1; j < 8; j++) {
        		if(i+j == s) {
        			list.add(new int[] {i,j});
        		}
        	}
        }
        for(int k = 0; k < list.size(); k++) {
        	key = list.indexOf(Math.abs(list.get(k)[0] - 4));

        }
        return answer =  list.get(key);
//        return answer = list.indexOf(Math.max(iArr));
    }
	 
	// 다섯번째 도전(도전중)
	// 검색하면서 아이디어 찾는 중..
	 public int[] lessons512938(int n, int s) {
		 if(s<n) {
			 return new int[]{-1};
		 }
		int[] answer = new int[n];	
//		List<int[]> list = new ArrayList<>();
		
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = s/n; // 3, 3, 3
        }
        
        // 이게 핵심이다 s%n의 나머지 값만큼 i++하여 해당 값만큼의 인덱스를 돌려서 하나씩 값을 올린다.
        // 이렇게 하면 만약 10/3을 했을 시 3, 3, 3에서 소외된 나머지 (+1)의 값을 인덱스의 0번에 1을 더하여 채워준다.
        for(int i = 0; i < s%n ; i++ ) {
        	answer[i]++;
        }
        
        // 그리고 곱할때의 값은 숫자의 크기와 순서에 영향을 받기 때문에 sort 함수를 사용하여
        // 제일 큰 순서로 배열을 정렬한다.
        Arrays.sort(answer);
        return answer;
    }
}