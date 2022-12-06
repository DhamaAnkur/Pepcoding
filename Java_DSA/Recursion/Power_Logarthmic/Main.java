
//Power logarithmic using recursion
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int x = scn.nextInt();
      int n = scn.nextInt();
      int ans  =  power(x,n);
      System.out.println(ans);
      
    }

    public static int power(int x, int n){
        if(n==0)
        return 1;       
        
        int xpnb2 = power(x , n/2);  // if we need X-power-N then we also computing like this X-power-N/2 * X-power-N/2 ;
        int xpn = xpnb2 *xpnb2;
        
        if(n%2!=0)     // if X-power-N is odd then we do X-power-N ==  X-power-N/2 * X-power-N/2 * X
        xpn = xpn*x;
        
        return xpn;
    }

}