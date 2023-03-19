
//Print Zig Zag using recursion
//Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/print-zig-zag-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =3;
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0)
        return ;
        
        System.out.print(n+" ");     // it is work for leftside(Pre)
        pzz(n-1);
        System.out.print( n+" ");    // it is work for between(In)
        pzz(n-1);
        System.out.print(n+" ");     // it is work for rightside(Post)
    }

}