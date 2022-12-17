
// Get KPc using recursion 
// Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-kpc-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {
    
    static String []codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     String str = scn.nextLine();
     
     System.out.println(getKPC(str));
    }

    public static ArrayList<String> getKPC(String str) {
       
       if(str.length() == 0){
           ArrayList <String> base = new ArrayList<>();
           base.add("");
           return base;
       }
       
       char ch  = str.charAt(0);
       String ros = str.substring(1);
       
       ArrayList<String> recAns = getKPC(ros);
       ArrayList<String> myAns = new ArrayList<>();
       
       int idx = ch-'0';   
       
       String code  = codes[idx];
       
       
       for(int i=0; i<code.length(); i++){
           char newCh = code.charAt(i);
           for(String ele : recAns){
               myAns.add(newCh + ele);
           }
       }
        
        
        return myAns ;
        
        
        
        
    }

}