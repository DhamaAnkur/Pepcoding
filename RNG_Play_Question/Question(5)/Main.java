import java.util.*;
import java.io.*;

public class Main {

    public static int[] sortArr(int[]arr){
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;

    }

    p
        int [] ans  = new int[arr.length];
        ans =  sortArr(arr); 
        
       
    }

}