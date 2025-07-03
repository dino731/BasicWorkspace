#include <stdio.h>
int main() {
    char ch, str[] = "12345000";
    int i, j;
    for (i = 0; i < 8; i++) {
        ch = str[i];
        if (ch == '0')
            break;

    }
    i--;
    printf("%d\n",i);
    for (j = 0; j < i; j++) {
        ch = str[j];
        str[j] = str[i];
        str[i] = ch;
        i--;
    }
    printf("%s", str);
    return 0;
}