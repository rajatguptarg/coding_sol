/*
 * Author: Rajat Gupta
 * Problem: FIZZ BUZZ
 */

#include <stdio.h>

void FizzBuzz() {
    int i, flag;
    for(i=1; i <= 100; i++) {
        flag = 1; 
        if(i%3 == 0) {
            printf("Fizz");
            flag = 0;
        }

        if(i%5 == 0) {
            printf("Buzz");
            flag = 0;
        }

        if(flag) {
            printf("%d", i);
        }
        printf("\n");
    }
}

int main() {
    FizzBuzz();
    return 0;
}
