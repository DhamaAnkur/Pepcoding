
//Exit Point of Matrix
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/exit-point-matrix-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
    
    public static void exitPointOfMatrix(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int dir = 0;
        int i=0; 
        int j=0;
        
        
        while(true){
              
              dir += arr[i][j];
              dir %= 4;
              
              if(dir == 0){
                j++;
              }
              
              else if(dir == 1){
                i++;
              }
              
              else if(dir == 2){
                j--; 
              }
              
              else if(dir == 3){
                i--;
              }
            
            
            if(i<0 || i>=n || j<0 || j>=m){
                break;
            }
        }
        
        if(i<0){
            i++;
        }
        
        else if(i>=n){
            i--;
        }
        
        else if(j<0){
            j++;
        }
        
        else if(j>=m){
            j--;
        }
        
        System.out.println(i);
        System.out.println(j);
        
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        exitPointOfMatrix(arr);
        
        
        }

}