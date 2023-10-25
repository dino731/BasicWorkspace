package com.programmers.lvzero;

import java.time.LocalDate;

public class Lessons120820 {
    public int lessons120820(int age) {
    	LocalDate toDay = LocalDate.now();
    	int year = toDay.getYear();
        return year - age;
    }
    // 간결화 시킨 코드 속도가 조금 더 개선된 것 같다
        public int lessons2120820(int age) {
        	LocalDate toDay = LocalDate.now();
            return toDay.getYear() - age;
        }
}
