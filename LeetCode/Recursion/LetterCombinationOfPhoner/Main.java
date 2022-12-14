
import java.util.*;

class Solution {

     // Question --> Letter combination of a Phone
    //Link of Question ( https://leetcode.com/problems/letter-combinations-of-a-phone-number/ )

   public List<String> letterCombinations(String str) {

       if(str.length() == 0){
           ArrayList<String> base =  new ArrayList<>();
           base.add("");
           return base;
       }

       char ch = str.charAt(0);
       String ros  = str.substring(1);
        
       List<String> recAns = letterCombinations(ros);
       ArrayList<String> myAns = new ArrayList<>();
       String []Alphabets = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;
        int idx = ch-'0';

        String keys = Alphabets[idx];

        for(int i=0 ; i<keys.length(); i++){
           char newCh = keys.charAt(i);
           for(String ele : recAns){
               myAns.add(newCh+ele+"");
           }
        }   
        
       return myAns;

   }
}