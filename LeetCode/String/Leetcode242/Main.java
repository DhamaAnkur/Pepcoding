
//Leetcode 242 Valid Anagram
//Link of this question( https://leetcode.com/problems/valid-anagram/ )
import java.util.*;

class Main {
    public boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
    HashMap<Character,Integer> hm  = new HashMap<>();

     for(int i=0; i<a.length(); i++){
        char ch = a.charAt(i);
        hm.put(ch , hm.getOrDefault(ch , 0) + 1);
     }

    HashMap<Character,Integer> hm2  = new HashMap<>();
    for(int i=0; i<b.length(); i++){
        char ch = b.charAt(i);
        hm2.put(ch , hm2.getOrDefault(ch , 0) + 1);
     }
 
    for(int i=0; i<b.length(); i++){
        char ch = b.charAt(i);
        if(hm.containsKey(ch)){
            continue;
        }
        else{
            return false;
        }
    }

    return true; 

    }
}