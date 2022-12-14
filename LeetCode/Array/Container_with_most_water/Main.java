
class Solution {
    public int maxArea(int[] height) {
        
    int i = 0 ;
    int j = height.length-1 ;
    int ans  = 0 ;
    int mul = 1 ;
    int min = -1 ;

    while(i<=j){

    min = Math.min(height[i] , height[j]);
    mul = j-i ;
    
    ans  = Math.max(min*mul , ans) ;
    
    if(height[i] < height[j]){
        i++;
    }
    else {
        j--;
    }
 


    }

     return ans ;
    }
}