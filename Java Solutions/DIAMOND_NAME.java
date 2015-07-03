/*
 * Author: Rajat Gupta
 */

import java.io.*;

class Solution {
    public static void main(String[] args) {
        
        String num = null;
        int n, c, k, space = 1;

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            num = is.readLine();
        } 
        catch( IOException e) {
            System.out.println("IOException: " + e);
        }

        n = Integer.parseInt(num);
        space = n - 1;
        for (k = 1; k < n; k++) {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
            space--;

            for (c = 1; c <= 2*k-1; c++)
                System.out.print("*");
                                         
            System.out.print("\n");
        }

        System.out.print("Rajat\n");

        space = 1;
        for (k = 1; k <= n - 1; k++) {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
                                     
            space++;
                                         
            for (c = 1 ; c <= 2*(n-k)-1; c++)
                System.out.print("*");
                                             
            System.out.print("\n");
        }

    }
}
