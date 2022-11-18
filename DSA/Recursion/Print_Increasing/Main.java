
//Print Increasing using recursion
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-increasing-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        
        if(n<=0){
            return ;
        }
        
     
       printIncreasing(n-1);
       System.out.println(n);    //because of when it backtrack from stack then the print statement work 
    }

}