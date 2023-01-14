
//Get MazePath using recursion 
// Link of this question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      // int n =scn.nextInt();
      // int m =scn.nextInt();

      int n =3;
      int m =3;
      
      int sr = 0; // sr  - source row
      int sc = 0; // sc - source column
      int dr = n-1; // dr - destination row
      int dc = m-1; // dc - destination column
      
      ArrayList<String> ans  =   getMazePaths(sr,sc,dr,dc);
      System.out.println(ans);
      
    }

     
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> base  = new ArrayList<>();
            base.add("");
            return base;
        }
        
          ArrayList<String> myAns = new ArrayList<>();
         
           if(sc+1 <= dc){
              ArrayList<String> recAns2 = getMazePaths(sr,sc+1,dr,dc);
                for(String ele : recAns2){
                myAns.add("h"+ele);
            }
          }
         
          if(sr+1 <= dr){
           ArrayList<String> recAns = getMazePaths(sr+1,sc,dr,dc);
            for(String ele : recAns){
                myAns.add("v"+ele);
            }
         }
        
        
        return myAns;
    }

}