import java.util.*;

public class StringDemo2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String a = "hello";
        String b = "hello";

        String c = new String("hello"); // when we take new String as input then a new memory address/location make in
                                        // heap.

        // if(a==b){ 
        // System.out.println("yes");
        // }
        // else {
        // System.out.println("no");
        // }

        // if(a==c){ // check the address/location is same or not
        // System.out.println("yes");
        // }
        // else {
        // System.out.println("no");
        // }

        if (a.equals(c)) { // equals method is used to check the  content(char or String) value is same or not
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
