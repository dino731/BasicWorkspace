package com.programmers.lvtwo;
import java.util.Arrays;
public class Lessons12939 {
	// 첫번째 풀이 실패
    public String lessons12939(String s) {
        char[] c = s.toCharArray();
        int[] iArr = new int[c.length];
        for(int i = 0; i < c.length; i++) {
        	iArr[i] += (c[i] - 48);
        }
        int min = Arrays.stream(iArr).min().orElse(0);
        int max = Arrays.stream(iArr).max().orElse(0);
        String answer = String.valueOf(min+" "+max);
     
        return answer ;
    }
    // 두번째 풀이 성공
    public String lessons212939(String s) {
    	String[] sArr = s.split(" ");
    	int[] iArr = new int[sArr.length];
    	int index = 0;
    	for(String part : sArr) {
    		iArr[index] += Integer.valueOf(part);
    		index++;
    	}
    	Arrays.sort(iArr);
        return iArr[0]+ " " + iArr[index] ;
    }

}
