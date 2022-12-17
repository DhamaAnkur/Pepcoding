
//Max of array using recursion
//Link of question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/max-of-an-array-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int []arr = new int[n];
      for(int i=0; i<n; i++){
          arr[i]= scn.nextInt();
      }
      
      int max = maxOfArray(arr,0);
      System.out.println(max);
    }
    
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
        return arr[idx];
        }
        
       int ans = maxOfArray(arr, idx+1);
        return Math.max(ans , arr[idx]);
    }

}