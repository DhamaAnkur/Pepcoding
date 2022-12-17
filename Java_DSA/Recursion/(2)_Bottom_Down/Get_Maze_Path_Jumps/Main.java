
// Get maze path with jump
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int m = scn.nextInt();
     int sr = 0;     // sr - source row
     int sc = 0;      // sc -source column
     int dr = n-1 ;  // dr - destination row
     int dc = m-1 ;  // dc - destination column
     
     ArrayList<String> ans  = getMazePaths(sr,sc,dr,dc);
     System.out.println(ans);
    }

   
  
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> base  = new ArrayList<>();
            base.add("");
            return base ;
        }
        
        ArrayList<String> myAns = new ArrayList<>();
        
             for(int jump =1 ; sc+jump <= dc; jump++){
                ArrayList<String> hCall = getMazePaths(sr,sc+jump,dr,dc);
                for(String ele : hCall){
                    myAns.add("h"+jump +ele);
                }
            }
            
      
            for(int jump =1 ;sr+jump <= dr; jump++){
                ArrayList<String> vCall = getMazePaths(sr+jump,sc,dr,dc);
                for(String ele : vCall){
                    myAns.add("v"+jump+ele);
                }
            }
            
            
            for(int jump=1 ;sr+jump <= dr && sc+jump <= dc ; jump++){
                ArrayList<String> dCall = getMazePaths(sr+jump,sc+jump,dr,dc);
                for(String ele : dCall){
                    myAns.add("d"+jump+ele);
                }
            }
        
        

        return myAns;
        
        
        
    }

}

