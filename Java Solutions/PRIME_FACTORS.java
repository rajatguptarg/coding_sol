/*
 * Author: Rajat Gupta
 */

import java.io.*;

class Solution {

    public static int[] generate(int n) {
        int[] num_list = new int[10000];
        int pos = 0, i;

        while(n%2 == 0) {
            num_list[pos++] = 2;
            n /= 2;
        }

        for(i=3; i<= Math.sqrt(n)+1; i += 2) {
            while(n%i == 0) {
                num_list[pos++] = i;
                n /= i;
            }
        }

        if(n > 2)
            num_list[pos++] = n;

        return num_list;
    }

    public static void main(String[] args) {
        
        String num = null;
        int n, i; 
        int[] my_num_list = new int[10000];

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            num = is.readLine();
        } 
        catch( IOException e) {
            System.out.println("IOException: " + e);
        }

        n = Integer.parseInt(num);
        
        my_num_list = generate(n);

        for(i=0; my_num_list[i]!=0; i++) {
            System.out.print(my_num_list[i]+" ");
        }
        System.out.print("\n");
    }
}
