
// Find First and Last Position of Element in Sorted Array

import java.util.*;
import java.io.*;

class Solution {
    public int[] searchRange(int[] arr, int tar) {
        int idx= 0 ;
        int []ans = new int[2];
        int []ans2 = {-1,-1};

        for(int i=0; i<arr.length; i++){
            if(tar == arr[i]){
                ans[idx] = i;
                idx++;
                break ;
            }
        }

        for(int i=arr.length-1; i>=0; i--){
            if(tar == arr[i]){
                ans[idx] = i;
                return ans ;
            }
        }
        
           return ans2 ;
        
    }
}