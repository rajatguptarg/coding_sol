/*
 * Author: Rajat Gupta
 */

#include <stdio.h>

#define read(n) scanf("%d", &n)

int main() {
    int n, i, j;
    read(n);
    for(i=1; i<=n; i++) {
        for(j=1; j<=i; j++) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}
