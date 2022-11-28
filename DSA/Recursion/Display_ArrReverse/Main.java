
//Display Array in Reverse using Recursion
//Link 0f Question ( https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/display-array-in-reverse/ojquestion )


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr  = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        
        displayArrReverse(arr , 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
     
     if(idx==arr.length)
     return ;
     
     
     displayArrReverse(arr, idx+1);
     System.out.println(arr[idx]);
    }

}