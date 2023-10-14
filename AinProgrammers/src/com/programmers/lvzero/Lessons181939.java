package com.programmers.lvzero;

class Lessons181939 {

	public int lessons181939(int a, int b) {
		int answer = 0;
		String s1 = Integer.toString(a)+ Integer.toString(b);
		String s2 = Integer.toString(b)+ Integer.toString(a);
		int result1 = Integer.parseInt(s1);
		int result2 = Integer.parseInt(s2);
		answer = Math.max(result1, result2);
		return answer;
	}
	// 다른 사람이 푼걸 바탕으로 다시 풀이
	public int lessons2181939(int a, int b) {
		int answer = 0;
		int a1 = Integer.parseInt(""+a+b);
		int b2 = Integer.parseInt(""+b+a);
		answer = Math.max(a1, b2);
		return answer;
	}
	// 남이 푼 것 
	// ""를 더해주면 문자열로 자동 형변환 됨
	// 삼항연산자 활용을 많이 하면 좋을 거 같아서 퍼옴
    public int lessons3181939(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
}
