
// Target sum subsetvusing recursion (backtrack)
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int []arr = new int[n];
     for(int i=0; i<n ; i++){
         arr[i] = scn.nextInt();
     }
     int tar = scn.nextInt();
     printTargetSumSubsets( arr, 0, "", 0, tar);
     
    }


    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar) {
        
        if(idx == arr.length ){
            
            if(tar == sum){
            System.out.println(asf+".");
            }
            
            return ;
        }
        
        //Pick idx value
        printTargetSumSubsets(arr , idx+1 , asf+arr[idx]+", " , sum + arr[idx] , tar);
        
        
        
        //Not Pick idx value
        printTargetSumSubsets(arr , idx+1 , asf,sum, tar);
        
        
        
        
    }

}