
//Print subsequence using recursion (bottom up approach)
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();
    
     printSS(str , "");
     
    }

    public static void printSS(String str, String ans) {
        
       if(str.length()==0){
          System.out.println(ans);
          return;
       }
       
       char ch = str.charAt(0);
       String ros = str.substring(1);
       
       printSS(ros, ans+ch);
       printSS(ros, ans);
       
    }

}