
// Search in a Sorted 2D Array(Matrix)
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/search-in-a-sorted-2d-array-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
    
    public static void searchIn2DMatrix(int [][]arr , int target){
        int n = arr.length;
        int i = 0; 
        int j = n-1;
        
        
        while(i<n &&  j>=0){
            int me = arr[i][j];
            
            if(me == target){
                System.out.println(i);
                System.out.println(j);
                return ;
            }
            
            else if(me> target){
                j--;
            }
            
            else{
                i++;
            }
             
            
        }
        
        System.out.println("Not Found");
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int [][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int target = scn.nextInt();
        
        searchIn2DMatrix(arr , target);
    }

}