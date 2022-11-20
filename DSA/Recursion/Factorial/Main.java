
//Factorial using recursion 
//Link of this Question( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/factorial-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int ans  = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){
      
      if(n==1){
          return 1;
      }
      
      
      int ans = factorial(n-1);   // store answer of previous value 
      return  ans*n;    // ans then multiply it to (6! = 6*5*4*3*2*1) 6!->5!->4!->3!->2!->1->return 1(because factorial of 1 is 1)
        
        
    }

}