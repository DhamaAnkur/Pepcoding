
//Search insertion position

import java.util.*;
import java.io.*;


class Solution {

    public int searchInsert(int[] nums, int target) {
        
   int i=0 ; 

   while(i<nums.length){

       if(target == nums[i]){
           return i;
       }

          else if(target > nums[i]){
            i++;
        }
         
         else if(target < nums[i]){
             return i;
         }
    
   }
     
    return i;

    }
}