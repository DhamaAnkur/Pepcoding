
//Print Maze Path using recursion (Bottom up)
//Link of question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-paths-official/ojquestion )

import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
	        
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int m = scn.nextInt();
	        
	        int sr =0;
	        int sc =0;
	        int dr =n-1;
	        int dc =m-1;
			String str = " ";
	        
	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	        
	        printMazePaths(sr,sc,dr,dc,str);

	    }

	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr == dr && sc==dc){
	            System.out.println(psf);
	        }
	        
	        
	        if(sc+1 <= dc){
	            printMazePaths(sr, sc+1 ,  dr, dc, psf+"h");
	        }
	        
	        
	        if(sr+1 <= dr){
	            printMazePaths(sr+1, sc, dr, dc,psf+"v");
	        }
	        
	    }

	}