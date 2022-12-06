
//String With Difference Of Every Two Consecutive Characters
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-with-difference-of-every-two-consecutive-characters-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder ans = new StringBuilder();
	    ans.append(str.charAt(0));
	    
	    for(int i=1 ; i<str.length(); i++){
	        
	        char prev = str.charAt(i-1);
	        char curr = str.charAt(i);
	        int diff = curr - prev; 
	        ans.append(diff);
	        ans.append(curr);
	    }
	  

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}