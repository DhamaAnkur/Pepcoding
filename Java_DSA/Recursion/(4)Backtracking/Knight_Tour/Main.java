// Knight Tour uding recursion (backrtacking)
// Link of Question( https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/knights-tour-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
    
     public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int r = scn.nextInt();
    int c = scn.nextInt();
    int[][]chess = new int[n][n];
    printKnightsTour(chess,r,c,1);
    
    }

    static int [][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
    
    public static void printKnightsTour(int[][] chess, int r, int c, int move) {
        
    if(move == chess.length * chess[0].length ){
        chess[r][c] = move;
        displayBoard(chess);
        chess[r][c] = 0 ;
        return ;
    }
    
  chess[r][c] = move;
   
   for(int d= 0 ;d<dir.length ; d++){
      int newr = r + dir[d][0];
      int newc = c + dir[d][1];
      
      if(newr>=0 && newc>=0 && newr<chess.length && newc<chess[0].length && chess[newr][newc] == 0 ){
         printKnightsTour(chess,newr,newc,move+1);
      }
   }
   
   chess[r][c] = 0 ;
    
     
    }
    
}



