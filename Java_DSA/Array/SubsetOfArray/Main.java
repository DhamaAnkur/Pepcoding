
//Subset of Array 
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main{

public static void subset(int []arr){

int n = arr.length ;
int total = (int)Math.pow(2,n);

for(int i=0; i<total ; i++){
     String str = "" ;
     int temp = i;
     
     for(int j = n-1; j>=0; j--){
     int rem = temp%2 ;
     temp = temp/2;
     
     if( rem == 0 ){
        str = "-\t" + str;
     }
     
     else{
         str = arr[j] + "\t" + str;
     }
        
     }
     
     System.out.println(str);
    
}

}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int [] arr  = new int[n];
    // for(int i=0 ; i<n; i ++){
    //     arr[i] = scn.nextInt();
    // }

    int [] arr = {1,2,3};
    
    subset(arr);
    
 }

}