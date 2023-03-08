
//Flood Fill usinf recursion (backtracking)
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/flood-fill-official/ojquestion )

//solution number - (1)

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        floodfill(arr, 0, 0, "");
    }

    static int[][] dir = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
    static String[] dirN = { "t", "l", "d", "r" };

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1) {
            return;
        }

        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        maze[sr][sc] = 1;

        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            floodfill(maze, r, c, asf + dirN[d]);
        }

        maze[sr][sc] = 0;

    }
}

/*--------------------------------------------------------------------------------------------------------------------- */
// Solutions number - (2)

// import java.io.*;
// import java.util.*;

// public class Main {

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int m = scn.nextInt();
// int[][] arr = new int[n][m];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// arr[i][j] = scn.nextInt();
// }
// }

// boolean [][]vis = new boolean[n][m];
// floodfill(arr, 0, 0, "", vis);
// }

// // asf -> answer so far
// public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][]vis) {

// if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || vis[sr][sc] == true || maze[sr][sc]==1){
// return ;
// }

// if(sr == maze.length-1 && sc == maze[0].length-1){
// System.out.println(asf);
// return ;
// }

// vis[sr][sc] = true ;
// floodfill(maze,sr-1,sc,asf+"t",vis);
// floodfill(maze,sr,sc-1,asf+"l",vis);
// floodfill(maze,sr+1,sc,asf+"d",vis);
// floodfill(maze,sr,sc+1,asf+"r",vis);
// vis[sr][sc] = false ;

// }
// }

/*------------------------------------------------------------------------------------------------------------------ */
//// solution number - (3)

/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * Scanner scn = new Scanner(System.in);
 * int n = scn.nextInt();
 * int m = scn.nextInt();
 * int[][] arr = new int[n][m];
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < m; j++) {
 * arr[i][j] = scn.nextInt();
 * }
 * }
 * 
 * floodfill(arr, 0, 0, "");
 * }
 * 
 * // asf -> answer so far
 * public static void floodfill(int[][] maze, int sr, int sc, String asf) {
 * if(sr<0 || sc<0 || sr==maze.length || sc==maze[0].length || maze[sr][sc]==1){
 * return ;
 * }
 * 
 * if(sr == maze.length-1 && sc == maze[0].length-1){
 * System.out.println(asf);
 * return ;
 * }
 * 
 * maze[sr][sc] = 1 ;
 * floodfill(maze,sr-1,sc,asf+"t");
 * floodfill(maze,sr,sc-1,asf+"l");
 * floodfill(maze,sr+1,sc,asf+"d");
 * floodfill(maze,sr,sc+1,asf+"r");
 * maze[sr][sc] = 0 ;
 * 
 * 
 * }
 * }
 */

 
/*---------------------------------------------------------------------------------------------------------- */
// solution number - (4)   This is the best approach to solve this question  
/*
 * import java.io.*;
 * import java.util.*;
 * 
 * public class Main {
 * 
 * public static void main(String[] args) {
 * Scanner scn = new Scanner(System.in);
 * int n = scn.nextInt();
 * int m = scn.nextInt();
 * int[][] arr = new int[n][m];
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < m; j++) {
 * arr[i][j] = scn.nextInt();
 * }
 * }
 * 
 * floodfill(arr, 0, 0, "");
 * }
 * 
 * static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
 * static String[]dirN = {"t","l","d","r"};
 * 
 * // asf -> answer so far
 * public static void floodfill(int[][] maze, int sr, int sc, String asf) {
 * 
 * if(maze[sr][sc]==1)
 * return;
 * 
 * if(sr == maze.length-1 && sc == maze[0].length-1){
 * System.out.println(asf);
 * return ;
 * }
 * 
 * maze[sr][sc] = 1 ;
 * 
 * for(int d=0; d<dir.length ; d++){
 * int r = sr+dir[d][0];
 * int c = sc+dir[d][1];
 * 
 * if(r>=0 && c>=0 && r<maze.length && c<maze[0].length){
 * floodfill(maze,r,c,asf+dirN[d]);
 * }
 * 
 * }
 * 
 * maze[sr][sc] = 0 ;
 * 
 * 
 * 
 * 
 * }
 * }
 */
