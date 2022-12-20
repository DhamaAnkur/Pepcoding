/*
 * 
 * 
 *
Q 4. Write a programme to find the
1. matching elements
2. non-matching elements
from two sets of arrays. Matching elements must contain only similar elements in two arrays
Non-matching elements must contain only different elements in two arrays, also numbers must not
repeat in the result array. For example:
Given - Array1 = [1,3,5,6,3,4,6,3,1,4,6,3,1,23,3]
Array2 = [,6,3,4,6,3,1,100,33,11,0,1,5,67]
Result – Matching = [1,3,5,6,4]
Non-Matching = [23,100,11,67]
 * 
 */

 import java.util.*;
 import java.io.*;

public class Main {
    
    
    public static int[] sort(int[]input){

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            
        }
       return input ;
    }

    public static void Output(int[]input){

        for(int ele: input){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr1 = {1,3,5,6,3,4,6,3,1,4,6,3,1,23,3};
        int []arr2 = {6,3,4,6,3,1,100,33,11,0,1,5,67};

        ArrayList<Integer> remDupArr1 = new ArrayList<>();
        ArrayList<Integer> remDupArr2 = new ArrayList<>();

        ArrayList<Integer> matching = new ArrayList<>();
        ArrayList<Integer> nonmatching = new ArrayList<>();


  // sort arrays ---------------------------
       int [] ans1 =  sort(arr1);
       int [] ans2  = sort(arr2);
       

       // remove duplicates for arr1-------------------
       for(int i = 0; i<ans1.length ; i++){
        if(i<ans1.length-1){
        if(ans1[i] != ans1[i+1]){
            remDupArr1.add(ans1[i]);
        }
    }
    }

    int a = ans1.length-1;
    remDupArr1.add(ans1[a]);


      // remove duplicates for arr2-------------------
    for(int i = 0; i<ans2.length ; i++){
        if(i<ans2.length-1){
        if(ans2[i] != ans2[i+1]){
            remDupArr2.add(ans2[i]);
        }
    }
    }

    int b = ans2.length-1;
    remDupArr2.add(ans2[b]);    


        /*------------------- for  matching element------------------- */
    for(int i=0 ; i<remDupArr1.size(); i++){
       for(int j =0; j<remDupArr2.size() ; j++){

        if(remDupArr1.get(i) == remDupArr2.get(j)){
         matching.add(remDupArr1.get(i));
        }

       }
    }

  
    /*------------------- for non matching element------------------- */
boolean flag = false ;
for(int i=0 ; i<remDupArr2.size(); i++){
    for(int j =0; j<remDupArr1.size() ; j++){
      if(remDupArr2.get(i) == remDupArr1.get(j)){
       flag = true ;
       break;
     }
     else{
        flag = false;
     }
    }

    if(flag == false && remDupArr2.get(i) != 0){
        nonmatching.add(remDupArr2.get(i));
    }
 }


 for(int i=0 ; i<remDupArr1.size(); i++){
    for(int j =0; j<remDupArr2.size() ; j++){
      if(remDupArr1.get(i) == remDupArr2.get(j)){
       flag = true ;
       break;
     }
     else{
        flag = false;
     }
    }

    if(flag == false && remDupArr1.get(i) != 0){
        nonmatching.add(remDupArr1.get(i));
    }
 }

       
 System.out.print("Matching array --> " + matching);
 System.out.println();
 System.out.print("Non matching array--> " +nonmatching);

   

    }
}
