import java.util.*;
import java.io.*;


public class Main {
    
    public static int[] differenceOfArray(int[]A, int[]B){
        int[] ans  = new int[B.length];
        int i = A.length-1;
        int j= B.length-1;
        int k = ans.length-1;
        int borrow = 0 ;
        
        while(j>=0){
            int digit = 0;
            digit += B[j] + borrow; 
            
            if(i>=0){
                digit -= A[i];
            }
            
            if(digit < 0){
                digit +=10 ;
                borrow =-1 ;
            }
            else{
                borrow = 0;
            }
            
            ans[k] = digit;
            i--;
            j--;
            k--;
            
            
        }
        
        return ans; 
     }
    
      public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] A = new int[n];
        // for(int i=0; i<n ; i++){
        //     A[i] = scn.nextInt();
        // }
        
        // int m = scn.nextInt();
        // int[] B = new int[m];
        // for(int i=0; i<m ; i++){
        //     B[i] = scn.nextInt();
        // }

        int [] A = {5, 6, 3};
        int [] B = {6, 3, 9};

        
        int [] ans  = differenceOfArray(A, B);
        
        int fnzi = -1;
        for(int i=0 ; i<ans.length ; i++){
            if(ans[i] != 0){
                fnzi = i;
                break;
            }
          
        }
        
          if(fnzi == -1){
                System.out.println("0");
            
            }
        
        else{
            
        for(int i = fnzi ; i<ans.length ; i++){
            System.out.println(ans[i]);
           }
           
        }

}

}
    
    
    
    
 