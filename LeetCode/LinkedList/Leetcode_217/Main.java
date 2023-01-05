// Leetcode--> 217. Contains Duplicate
//Link of Question( https://leetcode.com/problems/contains-duplicate/ )

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
     
       for(int i=0; i<nums.length; i++){
           if(hs.contains(nums[i])){
           return true ;
           }
           hs.add(nums[i]);
       }
       return false;

    }
}