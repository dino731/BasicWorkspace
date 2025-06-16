#include <stdio.h>

int add(int i, int j) {
    return i + j;
}

int sub(int i, int j) {
    return i - j;
}

int main() {
    int (*pf)(int, int);
    pf = add;
    printf("%d", pf(5, 4));
    pf = sub;
    printf("%d", pf(5, 4));
    return 0;
}

/*2025.06.16 c언어 코드
 *
 * ****공부할 필요가 있다*****
 *
 * pf = add와 pf = sub을 수기 작성하는 문제였다.
 * 흠.. c언어를 특별히 배운적이 없어서 특이하다 ()를 붙이지 않아도 실행이 된다는게..
 * 자바에서는 저렇게 넣으면 int에 이상한 문자를 대입했다고 난리날텐데
 * 이건 자동으로 add와 sub을 찾아서 동작한다.
 * 
 */