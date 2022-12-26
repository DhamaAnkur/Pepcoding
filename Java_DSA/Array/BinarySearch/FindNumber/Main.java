
// Find the index of (x)input number of an array.  


import java.util.*;
import java.io.*;

public class Main {
     
    public static int binarySearch(int[]arr , int x){
      
    int li = 0;
    int ri = arr.length-1;

   while(li<=ri){
  
    int mid = (li+ri)/2;
      if(x == arr[mid]){
         return mid ;
      }

      else if (x < arr[mid]){
           ri = mid -1 ;
      }

      else if(x > arr[mid]){
        li = mid+1;
      }

    }

    return -1;

    }
    public static void main(String [] args){
    int []arr =  {4,6,8,10,10,12,14,16,18,20,22,24};
    int x = 10 ;

    int ans = binarySearch(arr ,x);

    System.out.println(ans);

    }

}
