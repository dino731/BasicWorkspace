package com.programmers.lvone;

public class Lessons12947 {
//    public boolean lessons12947(int x) {
//        boolean answer = true;
//        String str = ""+x;
//        String[] arr = str.split("");
//
//        String s = "";
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++) {
//        	s = arr[i];
//        	sum += Integer.valueOf(s);
//        }
//        
//        System.out.println("sum : " + sum);
//        return answer = (x % sum == 0)? true : false;
//    }
    public boolean lessons212947(int x) {
		boolean answer = true;
        String str = ""+x;
        String[] arr = str.split("");

        String s = "";
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
        	s = arr[i];
        	sum += Integer.valueOf(s);
        }
        
        System.out.println("sum : " + sum);
        return answer = (x % sum == 0)? true : false;
    }
    
    public static void main(String[] args) {
    	Lessons12947 ri = new Lessons12947();
    	int x = 12;
    	boolean result = ri.lessons212947(x);
		System.out.println(result);
	}
}
