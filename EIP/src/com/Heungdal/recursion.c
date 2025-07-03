#include <stdio.h>
int func(int n) {
    if (n < 5) return 1;
    else if (n % 5 == 1)
        return n + func(n-5);
    else
        func(n-1);
}
int main() {
    int n = func(16);
    printf("%d", n);
    return 0;
}