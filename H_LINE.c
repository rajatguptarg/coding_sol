/*
 * Author: Rajat Gupta
 */

#include <stdio.h>

#define read(n) scanf("%d", &n)

int main() {
    int n;
    read(n);
    while(n--) {
        printf("*");
    }
    printf("\n");
    return 0;
}
