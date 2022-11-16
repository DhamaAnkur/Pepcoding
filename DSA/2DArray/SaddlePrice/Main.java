
//Saddle Price
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/saddle-price-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void saddlePrice(int[][] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int svj = 0;

            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < n; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(arr[i][svj]);
                return;
            }

        }

        System.out.println("Invalid input");
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        saddlePrice(arr);

    }

}