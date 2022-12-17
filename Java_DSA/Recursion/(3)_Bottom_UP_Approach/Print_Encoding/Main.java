
//Print Encoding using recursion 
//Link of the Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-encodings-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {
   
  
    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.next();
     
     printEncodings(str,"");
     
    }

    public static void printEncodings(String str, String asf) {
    
    if(str.length()==0){
        System.out.println(asf);
        return ;
    }
    
    
    if(str.charAt(0) == '0'){
        return ;
    }
    
    char ch1 = str.charAt(0);
    int v1 = ch1 - '0';
    char word = (char)(v1+'a'-1);
    
    printEncodings(str.substring(1) , asf+word);
    
    
    if(str.length() >1){
        char ch2 = str.charAt(1);
        int v2 = ch2- '0';
        int num  = v1*10+v2;
        char word2 = (char)(num+'a'-1);
        
        if(check <= 26){
             printEncodings(str.substring(2) , asf+word2);
        }
    }
    
    
    
    }

}