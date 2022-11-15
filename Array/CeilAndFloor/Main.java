
// Find ceil and floor of a number in given array
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion )

import java.util.*;
import java.io.*;

public class Main {
    
public static void ceilFloor(int[]arr , int x){

    int li = 0;
    int ri = arr.length-1;
    int ceil = 0;
    int floor = 0;

    while(li<=ri){

        int mid = (li+ri)/2;

        if(x < arr[0]){
            System.out.println("-1");
            break;
        }
        
       else if(x > arr[arr.length-1]){
            System.out.println("-1");
            break;
        }

       else if(arr[mid] == x){
         ceil = arr[mid] ;
         floor = arr[mid]  ;
         break;
        }

        else if(arr[mid] < x){
            floor = arr[mid];
            li = mid+1;
        }

        else if(arr[mid] > x){
            ceil = arr[mid];
            ri = mid-1;
        }
   
    }

    System.out.println("floor--> " + floor);
    System.out.println("ceil--> " + ceil);

}

    public static void main(String[] args) {
        
        int []arr = {1,5,10,15,22,33,40,42,55,66};
        int x = 56;

     ceilFloor(arr , x);

    }
}
