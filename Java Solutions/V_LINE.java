/*
 * Author: Rajat Gupta
 */

import java.io.*;

class Solution {
    public static void main(String[] args) {
        
        String num = null;
        int n;

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            num = is.readLine();
        } 
        catch( IOException e) {
            System.out.println("IOException: " + e);
        }

        n = Integer.parseInt(num);

        while(n > 0) {
            System.out.println("*");
            n--;
        }
        System.out.print("\n");

    }
}
