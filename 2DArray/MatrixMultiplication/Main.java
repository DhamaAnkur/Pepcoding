
//Matrix Multiplication
// Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/matrix-multiplication-official/ojquestion )


import java.io.*;
import java.util.*;

public class Main{
    
    public static Scanner scn  = new Scanner(System.in);
    
    //Make input fucntion
    public static void input(int[][]A){
        for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length; j++){
                A[i][j] = scn.nextInt();
            }
        }
    }
    
    
     //Make display function 
    public static void display(int[][]A){
          for(int i=0 ; i<A.length ; i++){
            for(int j=0 ; j<A[0].length; j++){
              System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    // make matrix multiplication function
    public static int[][] matrixMultiplication(int[][]A, int[][]B){
        
        int n1 = A.length ;
        int m1 = A[0].length ;
        int n2 = B.length ;
        int m2 = B[0].length ;
        
        int [][]C = new int[n1][m2];
        
        for(int i=0 ; i<n1 ; i++){
            for(int j=0 ; j<m2 ; j++){
                int sum = 0;
                
                for(int k =0 ; k<m1 ; k++) {
                sum += A[i][k] *B[k][j];
                }
                C[i][j] = sum ;
            }
        }
        return C;
    }

public static void main(String[] args) throws Exception {
    // write your code here
    
    int n1  = scn.nextInt();
    int m1  = scn.nextInt();
    int [][] A = new int[n1][m1];
    input(A);
    
    int n2  = scn.nextInt();
    int m2  = scn.nextInt();
    int [][] B = new int[n2][m2];
    input(B);
    
    if(m1 != n2){
        System.out.println("Invalid input");
    }
    
    else {
        int[][]C  = matrixMultiplication(A, B);
        display(C);
    }
    
 }

}