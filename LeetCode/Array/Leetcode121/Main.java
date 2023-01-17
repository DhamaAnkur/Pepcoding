class Solution {
    public int maxProfit(int[] prices) {
        
        int n  = prices.length ; 
       int ans  = 0;
       for(int i=0; i<n; i++){
           for(int j=i; j<n ; j++){
               int check = prices[j] - prices[i];

               if(ans<check){
                   ans = check ;
               }

           }
       }

if(ans>0){
    return ans ;
}

return 0;


    }
}