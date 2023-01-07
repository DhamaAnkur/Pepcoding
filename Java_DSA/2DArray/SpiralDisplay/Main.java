
//Spiral Display
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/spiral-display-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
    public static void  SpiralDisplay(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        
        int minRow = 0;
        int minCol = 0;
        int maxRow = n-1;
        int maxCol = m-1;
        int count = 0;
        int total = n*m;
        
        while(count<total){
            
          for(int i=minRow; i<=maxRow && count<total ; i++){
              System.out.println(arr[i][minCol]);
              count++;
          }
           minCol++;    
           
           for(int j=minCol; j<=maxCol && count<total ; j++){
               System.out.println(arr[maxRow][j]);
               count++;
           } 
           maxRow--;
          
           for(int i=maxRow; i>=minRow && count<total; i--){
               System.out.println(arr[i][maxCol]);
               count++;
           } 
           maxCol--;
           
            for(int j=maxCol; j>=minCol && count<total; j--){
               System.out.println(arr[minRow][j]);
               count++;
           } 
           minRow++;
            
        }
        
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr  = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        SpiralDisplay(arr);
        
    }

}