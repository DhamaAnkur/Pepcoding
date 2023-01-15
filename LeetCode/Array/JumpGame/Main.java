// Leetcode - 55 Jump Game 
// Link of Question( https://leetcode.com/problems/jump-game/description/ )

class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        int n = nums.length;

        for(int i=0; i<n ; i++){

            if(reachable<i) return false;
            reachable = Math.max(reachable , i+nums[i]);
        }
        return true;
    }
}