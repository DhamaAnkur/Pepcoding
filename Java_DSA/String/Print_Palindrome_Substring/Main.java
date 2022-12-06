package DSA.String.Print_Palindrome_Substring;

//Print all Palindrome Substring
// Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-palindromic-substrings-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean isPalindrome(String str){
    
        int i=0; 
        int j = str.length()-1;
        
        while(i<=j){
            
            int firstchar = str.charAt(i);
            int lastchar = str.charAt(j);
            
            if(firstchar == lastchar){
                i++;
                j--;
            }
            
            else {
               return false ;
            }
            
        }

        return true;
    }

	public static void solution(String str){
	
	int n = str.length();
	
	for(int st = 0 ; st<n ; st++){
	    for(int end=st ; end<n; end++){
	        
	        String subs = str.substring(st , end+1);
	        if(isPalindrome(subs)){
	            System.out.println(subs);
	        }
	    }
	}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}