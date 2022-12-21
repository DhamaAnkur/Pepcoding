//N Queens using recursion ( backtracking )
// Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/n-queens-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
        
    public static boolean isSafe(int[][]chess ,int r, int c){
    int n = chess.length;
    
    //1.. for i-- & j++
    
    for(int i=r-1 ,j=c+1 ; i>=0 && j<n ; i--,j++){
        if(chess[i][j] == 1)
        return false;
    }
    
     //2.. for i-- & j
    
    for(int i=r-1, j=c; i>=0 ; i--){
        if(chess[i][j] == 1)
        return false;
    }
    
     //3.. for i-- & j--
    
    for(int i=r-1 ,j=c-1 ; i>=0 && j>=0 ; i--,j--){
        if(chess[i][j] == 1)
        return false;
    }
    
    return true;
    
    }
    

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int[n][n];
        printNQueens(chess , "" , 0);
        
    }

    
    public static void printNQueens(int[][] chess, String asf, int row) {
        if(row == chess.length){
            System.out.println(asf+".");
            return ;
        }
        
        for( int col=0; col<chess.length; col++){
            if(isSafe(chess , row , col)){
                chess[row][col] = 1;
                printNQueens(chess, asf+row+"-"+col+", " , row+1);
                chess[row][col] = 0;
            }
        }
        
        
    }
}