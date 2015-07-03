/*
 * Author: Rajat Gupta
 */

import java.io.*;

class Solution {
    public static void main(String[] args) {
        
        String num = null;
        int n, i, j;

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            num = is.readLine();
        } 
        catch( IOException e) {
            System.out.println("IOException: " + e);
        }

        n = Integer.parseInt(num);

        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
