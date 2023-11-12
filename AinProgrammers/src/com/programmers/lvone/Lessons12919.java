package com.programmers.lvone;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class Lessons12919 {
//    public String lessons12919(String[] seoul) {
//        String answer = "";
//        Stream<String> kimStream = Arrays.stream(seoul);
//        return answer = kimStream.filter(e -> kimStream.startsWith("Kim")).findFirst()? "김서방은 "+e+"에 있다" : "김서방은 없다";
//    }
    
//    public String lessons212919(String[] seoul) {
//        String answer = "";
//        Stream<String> kimStream = Arrays.stream(seoul);
//        return answer = kimStream.anyMatch(e -> "Kim".equals(e))? "김서방은 "+kimStream.indexOf("Kim")+"에 있다" : "김서방은 없다";
//    }
    
//    public String lessons312919(String[] seoul) {
//        String answer = "";
//        Stream<String> kimStream = Arrays.stream(seoul);
//        int index = kimStream.filter(e -> e.startsWith("Kim")).findAny().map(kim -> {
//            Stream<String> tempStream = Arrays.stream(seoul);
//            return (int) tempStream.filter(k -> k.equals(kim)).count();}).orElse(-1);
//        return answer = "김서방은 "+index+"에 있다";
//    }
    
	// 구글링으로 해결
	// 다시 제대로 공부하기 2023.11.12
    public String lessons412919(String[] seoul) {
        Optional<Integer> index = Arrays.stream(seoul)
                .filter(e -> e.startsWith("Kim"))
                .findFirst()
                .map(kim -> IntStream.range(0, seoul.length)
                        .filter(i -> seoul[i].equals(kim))
                        .findFirst()
                        .orElse(-1));

        return index.isPresent() ? "김서방은 " + index.get() + "에 있다" : "김서방은 없다";
    }
    
    // 다른 사람의 풀이
    // 이렇게 쉬운 방법이 있다 ( stream을 공부해보고싶었음..)
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");        
        return "김서방은 "+ x + "에 있다";
    }
    
}
