//Leetcode -258 using simple Maths

class Solution {
    public int addDigits(int num) {

   if(num == 0){
       return 0;
   }
        
   int ans = (num%10) + (num/10);
    
    if(ans>9){
      int recAns =   addDigits(ans);
      return recAns ;
    }

    return ans ;
   

    }
}
