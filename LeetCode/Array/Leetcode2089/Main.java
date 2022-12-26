
//Find target indices after sortint array

import java.util.*;
import java.io.*;

class Solution {

    public static int[] sortArr(int[]arr){
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;

    }
    public List<Integer> targetIndices(int[] arr, int target) {
        int [] newArr  = new int[arr.length];
        newArr =  sortArr(arr);
        List<Integer> ans = new ArrayList<>();
         
         for(int i=0 ; i<newArr.length; i++){
             if(target == newArr[i]){
                 ans.add(i);
             }
         }
      
      return ans ;
   
    }
}