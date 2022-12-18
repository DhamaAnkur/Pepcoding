import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main (String [] args ){ 
         int n = scn.nextInt();  
         int []memo= new int[n+1];
         int ans  = rec(n  , memo);
         System.out.println(ans);
    }
 
    private static int rec(int n , int[]memo){
        if(n <= 1){
            return 1;
        }

        if(memo[n] > 0){
            return memo[n];
        }

           int opt1 = rec(n-1 , memo);
           int opt2 = rec(n-2 , memo);

           memo[n] = opt1 + opt2;
           
           return opt1 + opt2;
    }
}

