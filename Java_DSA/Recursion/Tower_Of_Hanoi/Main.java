
//Tower of Hanoi using recursion
//Link of the Question( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/toh-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int A = scn.nextInt();
        // int B = scn.nextInt();
        // int C = scn.nextInt();
        int n = 3;
        int A = 20;
        int B = 21;
        int C = 22;
        toh(n , A, B ,C);
    }

    public static void toh(int n, int A, int B, int C){
        if(n==0)
        return ;
        
        toh(n-1 , A , C , B);
        System.out.println(n+"["+ A +" -> "+ B+"]");
        toh(n-1, C, B ,A);
    }

}