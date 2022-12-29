//Leetcode -258 using simple Maths

class Solution {
    public int addDigits(int num) {

   if(num == 0){
       return 0;
   }

   int last = num%10;
   int first = num/10;
   int ans =  last+first;
    
    if(ans>9){
      int recAns =   addDigits(ans);
      return recAns ;
    }

    return ans ;
   

    }
}