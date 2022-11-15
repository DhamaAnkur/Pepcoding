
//Ring Rotate 
// Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/ring-rotate-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void swap (int []a , int i , int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
  
    public static void reverse(int[] a , int i , int j){
   
      while (i<=j){
          swap (a , i , j);
          i++;
          j--;
      }
    }
  
    
    public static int[] from2Dto1D(int[][]arr ,int s){
    int n =arr.length ;
    int m =arr[0].length ;
    
    int minR = s-1;
    int maxR = n-s;
    int minC = s-1;
    int maxC = m-s;
    
    int size  = 2*(maxR - minR + maxC - minC);
    
    int []oneD = new int[size];
    int idx = 0;
    
    for(int i=minR ; i<=maxR ; i++){
        oneD[idx] = arr[i][minC];
        idx++;
    }
    minC++;
    
    for(int j=minC ; j<=maxC ; j++){
        oneD[idx] = arr[maxR][j];
        idx++;
    }
    maxR--;
    
    for(int i=maxR ; i>=minR ; i--){
        oneD[idx] = arr[i][maxC];
        idx++;
    }
    maxC--;
    
    for(int j=maxC ; j>=minC ; j--){
        oneD[idx] = arr[minR][j];
        idx++;
    }
    minR++;
    
    return oneD;
    }
    
    public static void rotate(int[] a, int k){
     k = k%a.length;
     if (k<0){
         k+= a.length;
     }
    int n = a.length;
    reverse ( a  , 0 , n-k-1 );
    reverse ( a ,n-k , n-1 );
    reverse ( a , 0 , n-1 );
    
  }
    
    public static void from1Dto2D(int[]oneD , int[][]arr , int s){
    int n =arr.length ;
    int m =arr[0].length ;
    
    int minR = s-1;
    int maxR = n-s;
    int minC = s-1;
    int maxC = m-s;

    int idx = 0;
    
    for(int i=minR ; i<=maxR ; i++){
        arr[i][minC] =  oneD[idx] ;
        idx++;
    }
    minC++;
    
    for(int j=minC ; j<=maxC ; j++){
       arr[maxR][j] =  oneD[idx] ;
        idx++;
    }
    maxR--;
    
    for(int i=maxR ; i>=minR ; i--){
       arr[i][maxC] = oneD[idx];
        idx++;
    }
    maxC--;
    
    for(int j=maxC ; j>=minC ; j--){
        arr[minR][j] = oneD[idx] ;
        idx++;
    }
    minR++;
    
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]arr = new int[n][m];
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
       int[] oneD = from2Dto1D(arr, s);
       rotate(oneD ,r);
       from1Dto2D(oneD , arr ,s);
       display(arr);
       
    }


}