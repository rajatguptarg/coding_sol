/*
 * Author: Rajat Gupta
 */

class Solution {
    public static void fizzBuzz() {
        int i, flag;
        for(i=1; i <= 100; i++) {
            flag = 1; 
            if(i%3 == 0) {
                System.out.print("Fizz");
                flag = 0;
            }

            if(i%5 == 0) {
                System.out.print("Buzz");
                flag = 0;
            }

            if(flag == 1) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
