

import java.util.*;
public class StringDemo {

   public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);


      // create string
      String str = "aman";
      String st = "aman srivastava";
      String s = "";

      // input string
      String input = new String("aman srivastava");
      String inpu = new String("aman");
      String inp = new String("");
      String in = new String();

      //length of string 

      System.out.println("Length of string " + str.length());   /// the plus symbol is concatination 

      // get character

      char ch =  str.charAt(3);
      System.out.println("index value of  3 is --> " + ch);

     // concatination 

     System.out.println("My" + " name " + " is " + " Aman " + " Srivastava ");

     String a = "Aman";
     String b = " pepcoder";
     String c  = a+b;;
   
     System.out.println(c);


   // Input String for full length and single String

   // System.out.println("Enter your input here--> ");
   // String x = scn.nextLine();
   // System.out.println(x);
   

   // char input 

   System.out.println("Enter your string ");
   char firstChar = scn.next().charAt(0);
   System.out.println("Your 0 index char is --> ");
   System.out.println(firstChar);


   }

}
