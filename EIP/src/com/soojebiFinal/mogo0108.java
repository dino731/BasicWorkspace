package BasicWorkspace.EIP.src.com.soojebiFinal;

public class mogo0108 {
    public static void main(String[] args) {
        int sum = fact(5);
        System.out.println(sum);
    }
    public static int fact(int n) {
        if(n <= 2){
            return 1;
        }
        else {
            return fact(n-2) + fact(n-1);
        }
    }
    /* 2025.06.16 java문제도 풀어보았다
    * 흠... clion을 깔고 intellij idea와 Clion을 별도로 두고 번갈아 가면서 작업중인데
    * 자바는 연산 처리가 안된다.. 뭐가 문제일까? 이걸 해결해야 될텐데
    *
    * 해결 방법
    * edit configurations 검색해서 구성 편집으로 들어가서 + 추가 버튼으로 애플리케이션 생성하고
    * 상단에 pakage BasicWorkspace.EIP.src.com.soojebiFinal; 설정해주기!!
    * 
    * */
}