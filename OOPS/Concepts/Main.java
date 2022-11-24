
// Encapsulation 
// Link of class (----https://us06web.zoom.us/rec/play/L2jUiCyqoK7clORWbGYHlBdrUX6rej3CH58sYF5jfA1EGjYhtu7kOwamiEGvN2YS-sAEuiT0dDLHbCm2.JazjaRlrRSIeNWiE?continueMode=true&_x_zm_rtaid=xjmr3I1qTp6qqJ0EeZiqVQ.1663163670689.8e19d1db0da74fc14e1544897f5192e2&_x_zm_rhtaid=234----)

import java.util.*;

class Main{ 
   
   class person{
       int age ;
       String name;

       void sayHi(){
       System.out.println(this.name + "[" + this.age + "] sayHiiii");
       }
 
   }


class public static void main(String[] args) {
     
   person p1 = new person();
   p1.name = "Ankur";
   p1.age = 23;

   p1.sayHi();

   person p2 = new person();
   p2.name = "Ajay";
   p2.age = 22;
   p2.sayHi();

   // p2.name = "Abhi";

  person p3 = p2 ;
  p3.sayHi();

  

}

}