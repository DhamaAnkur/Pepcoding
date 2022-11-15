
// Sum of two array
// Link of question ( https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum-of-two-arrays-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main{
    
    public static void sumOfArray(int[] A , int[] B){
        int carry = 0;
        int n1 = A.length;
        int n2 = B.length;
        
        int size =  (n1>n2)? n1 : n2 ;
        int [] ans =  new int[size];
        
        int i = n1-1;
        int j = n2-1;
        int k = ans.length-1;
        
        while(k>=0){
         int sum = 0;
         sum += carry ;
         
         if(i>=0){
             sum += A[i];
         }
         
         if(j>=0){
             sum += B[j];
         }
         
         int val = sum%10;
         carry = sum/10;
         
         ans[k] = val;
         
         i--;
         j--;
         k--;
        
        }
        
        if(carry != 0){
            System.out.println(carry);
        }
        
        for(int ele : ans){
        System.out.println(ele);
        }
    } 
    
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int []A = new int[n];
    for(int i=0; i<n; i++){
        A[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
    int []B = new int[m];
     for(int j=0; j<n; j++){
        B[j] = scn.nextInt();
    }
    
   sumOfArray(A ,B);
    
 }

}