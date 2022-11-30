
//Find last index of array
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/last-index-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[]arr = new int[n];
      for(int i=0; i<n; i++){
          arr[i] = scn.nextInt();
      }
      int x = scn.nextInt();
      int ans  = lastIndex(arr ,arr.length-1,x);
      System.out.println(ans);
      
    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx==-1)
        return -1;
        
        if(arr[idx]==x){
            return idx;
        }
        
        return  lastIndex(arr,idx-1,x);
        
    }

}