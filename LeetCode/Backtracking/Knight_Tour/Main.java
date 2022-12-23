
// Leetcode 688 --> Knight Probability in chessboard


class Solution {

    public static int [][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};

    public double knightProbability(int n, int k, int row, int column) {
        
    HashMap<String , Double> hm = new HashMap<>();
    return Probability(n , k , row ,column, hm);

    }
    
    public static Double Probability(int n, int k , int r, int c , HashMap<String , Double> hm) {
          if(k==0)
           return 1. ;
       
       String key = r + "Knight" + c + "Tour" + k ;

       if(hm.containsKey(key)){
           return hm.get(key);
       }

       double probability = 0;

       for(int d= 0 ;d<dir.length ; d++){
         int newr = r + dir[d][0];
         int newc = c + dir[d][1];

         if(newr>=0 && newc>=0 && newr<n && newc<n){
             probability += Probability(n,k-1,newr,newc,hm)/8.0;
         }

   }

      hm.put(key ,probability);
      return probability ;
 
     
    }

}