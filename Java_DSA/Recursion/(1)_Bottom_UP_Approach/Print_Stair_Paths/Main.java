
//Print Stair Paths using recursion(bottom up)
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-stair-paths-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String path = "";

        printStairPaths(n, path);

    }

    public static void printStairPaths(int n, String path) {

        if (n == 0) {
            System.out.println(path);
        }

        if (n - 1 >= 0) {
            printStairPaths(n - 1, path + 1);
        }

        if (n - 2 >= 0) {
            printStairPaths(n - 2, path + 2);
        }

        if (n - 3 >= 0) {
            printStairPaths(n - 3, path + 3);
        }

        // Another soltion for this question -----------------

        /*
         * 
         * if (n == 0) {
         * System.out.println(path);
         * }
         * 
         * for(int i=1 ;i<4 ; i++){
         * if(n-i >= 0){
         * printStairPaths(n-i, path+i);
         * }
         * }
         * 
         * 
         * 
         */


         // Another soltuion 

    }

}