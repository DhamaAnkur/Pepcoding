
//Toggle case suing String Builder 
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/toggle-case-official/ojquestion )



import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
       StringBuilder ans = new StringBuilder();
      
    //   formula-->  "D" -"A" == "d" = "a"
    
       for(int i=0 ; i<str.length(); i++){
           char ch =  str.charAt(i);
           
           if(ch >= 'A' && ch<='Z'){    // This is UpperCase and converted it to lowerCase
            char lc = (char)(ch - 'A' + 'a') ;
            ans.append(lc);
           }
           
           else{                       // This is lowerCase and converted it to UpperCase
               char uc = (char)(ch - 'a' + 'A');
               ans.append(uc);
           }
           
       }
       
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}