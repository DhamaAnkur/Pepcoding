import java.util.*;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main (String [] args ){ 
         int n = scn.nextInt();  
         int []arr= new int[n+1];
         int ans  = rec(n  , arr);
         System.out.println(ans);
    }
 
    private static int rec(int n , int[]arr){
        if(n <= 1){
            return 1;
        }

        if(arr[n] > 0){
            return arr[n];
        }
           int opt1 = rec(n-1 , arr);
           int opt2 = rec(n-2 , arr);

           arr[n] = opt1 + opt2;
           
           return opt1 + opt2;
    }
}

