// Leetcode 561 
import java.util.*;
class Main {

    public int arrayPairSum(int[] arr) {
    Arrays.sort(arr);
    int i =0;
    int j=1;
    int sum = 0;

    while(i<=arr.length && j<=arr.length){
        int a = arr[i];
        int b = arr[j];
        sum += Math.min(a , b);
        i = i+2;
        j = j+2;

    }

    return sum ;


    }
}