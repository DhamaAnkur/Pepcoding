import java.util.*;
class Main {
    public int[] twoSum(int[] nums, int target) {
        
        int [] result = new int[2];
        HashMap<Integer , Integer> HashMap = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            if(HashMap.containsKey(target - nums[i])){
              result[1] = i ; 
              result[0] = HashMap.get(target - nums[i]);
                  return result ;
            }
             
            HashMap.put(nums[i] , i);
        }
        
        return result ;
        // Changes
        
        
        
    }
}