
//Power linear using recursion 
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-linear-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans  = power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
     
       if(n==0)
       return 1;
     
     int ans = power(x , n-1);
     int ans1 = ans*x;
     return ans1;
       
    }

}  