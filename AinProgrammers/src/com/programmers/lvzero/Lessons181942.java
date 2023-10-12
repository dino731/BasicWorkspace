package com.programmers.lvzero;

class Lessons181942 {
    public String Lessons181942(String str1, String str2) {
        String answer = "";
        int result = Math.max(str1.length(),str2.length());
        // 길이가 다른 경우의 수를 생각해서 넣었는데 굳이 안넣어도 됐을 것 같다
        // Math.max(,)는 두 인자중 가장 큰 값을 얻는다.
        for(int i = 0; i < result; i++){
                answer += str1.charAt(i);
                answer += str2.charAt(i);
            }
        return answer;
    }
}
