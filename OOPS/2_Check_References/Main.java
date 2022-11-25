
// Encapsulation 
 // Link of Class (----https://us06web.zoom.us/rec/play/L2jUiCyqoK7clORWbGYHlBdrUX6rej3CH58sYF5jfA1EGjYhtu7kOwamiEGvN2YS-sAEuiT0dDLHbCm2.JazjaRlrRSIeNWiE?continueMode=true&_x_zm_rtaid=xjmr3I1qTp6qqJ0EeZiqVQ.1663163670689.8e19d1db0da74fc14e1544897f5192e2&_x_zm_rhtaid=234----)

 import java.util.*;

 class Main{
 
      static class point{
         int x;
         int y;
 
     }
 
       static class Rectangle{
         point LT ;
         point BR ;
 
      }
 
      public static void main( String[] args){
       Rectangle r = new Rectangle();   // This line is  Used as a instence or reference both here same time    
       r.LT =new point();      // This line is  Used as a instence or reference both here same time
       r.LT.x = 2;
       r.LT.y = 4;
 
       r.BR =new point();       // This line is  Used as a instence or reference both here same time
       r.BR.x = 6;
       r.BR.y = 1;
 
      }
 
 
 
 
 
 
 
 
 
 
 }