
// Find Finrst Index and Last Index of duplicate number in a sorted array
//Link of Question--> ( https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first-index-last-index-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static int FirstIdx(int[] arr, int x) {
        int li = 0;
        int ri = arr.length - 1;
        int first = -1;

        while (li <= ri) {
            int mid = (li + ri) / 2;

            if (arr[mid] == x) {
                first = mid;
                ri = mid - 1;
            }

            else if (arr[mid] > x) {
                ri = mid - 1;
            }

            else {
                li = mid + 1;
            }

        }

        return first;
    }

    public static int LastIdx(int[] arr, int x) {
        int li = 0;
        int ri = arr.length - 1;
        int Last = -1;

        while (li <= ri) {
            int mid = (li + ri) / 2;

            if (arr[mid] == x) {
                Last = mid;
                li = mid + 1;
            }

            else if (arr[mid] > x) {
                ri = mid - 1;
            }

            else {
                li = mid + 1;
            }

        }

        return Last;

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int fi = FirstIdx(arr, x);
        int li = LastIdx(arr, x);

        System.out.println(fi);
        System.out.println(li);
    }

}