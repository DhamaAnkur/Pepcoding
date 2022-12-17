
//Get Subsequence using Recursion 
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-subsequence-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.next();
     
     ArrayList <String> ans = gss(str);
     System.out.println(ans);
     
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
           ArrayList <String> al = new ArrayList<>();
           al.add("");
           return  al;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> recAns = gss(ros);
        ArrayList<String> myAns = new ArrayList<>();
        
          for(String ele : recAns){
          myAns.add(ele);
        }
        
        for(String ele : recAns){
          myAns.add(ch+ele);
        }
         
         
         return myAns ;
    }

}