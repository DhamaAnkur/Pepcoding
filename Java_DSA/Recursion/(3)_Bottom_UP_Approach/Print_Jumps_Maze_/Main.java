
// Print Maze Path with Jumps using recursion(Bottom Up)
// Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-path-with-jumps-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");

    }

    static int[][] dir = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
    static String[] dirN = { "h", "v", "d" };

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        for (int d = 0; d < dir.length; d++) {
            for (int jump = 1; jump <= Math.max(dr, dc); jump++) {

                int r = sr + (jump * dir[d][0]);
                int c = sc + (jump * dir[d][1]);

                if (r >= 0 && r <= dr && c >= 0 && c <= dc) {
                    printMazePaths(r, c, dr, dc, psf + dirN[d] + jump);
                }

            }
        }

    }

}

/*----------------------------------------------------------------------------------------------------------------
// Another solution -- Mandatory because it is efficient
 * import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        printMazePaths(0,0,n-1,m-1,""); 
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
     if(sr==dr && sc ==dc){
         System.out.println(psf);
         return;
     }   
     
       for(int i=1 ; i<=dc  ; i++){
         if(sc+i <= dc){
             printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
         }
         
     }
      
     for(int i=1 ; i<=dr  ; i++){
         if(sr+i <= dr){
             printMazePaths(sr+i,sc,dr,dc,psf+"v"+i);
         }
     }
     
     for(int i=1 ; i<=dr && i<=dc; i++){
         if(sr+i <= dr && sc+i <= dc){
             printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i);
         }
     }
     
    }

}
 * 
 * 
 */