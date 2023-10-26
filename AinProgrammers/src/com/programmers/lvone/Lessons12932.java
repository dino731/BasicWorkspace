package com.programmers.lvone;

public class Lessons12932 {
	// 첫번째 풀이(실패)  20231026
	public int[] lessons12932(long n) {
		String result = String.valueOf(n);
		int[] answer = new int[result.length()];
		
        for(int i = 0; i < result.length(); i++){
            answer[i]= (int)result.charAt(i)-48;
        }
        return answer;
	}
	// 두번째 풀이()  20231026
	public int[] lessons212932(long n) {
		String result = String.valueOf(n);
		int[] answer = new int[result.length()];
		
		int count = 0;
        for(int i = result.length()-1; i >= 0; i--){
            answer[count]= (int)result.charAt(i)-48;
            count++;
        }
        return answer;
	}

	// 다른 사람 풀이
	// 생소한 함수가 많다 익혀두자
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
