
//SubArray Problem
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main{
    
    public static void subArray(int[]arr){
        
        int n = arr.length;
        
        for(int st = 0 ; st<n ; st++){
            for(int end = st ; end<n ; end++){
                
                for(int k=st ; k<=end ; k++){
                    System.out.print(arr[k] + " ");
                }
                
                System.out.println();
                
            }
        }
        
    }

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int  n =scn.nextInt();
    int[]arr = new int[n];
     for(int i=0 ; i<n; i++){
         arr[i] = scn.nextInt();
     }
     
     subArray(arr);
    
 }

}