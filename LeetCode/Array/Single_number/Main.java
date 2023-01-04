// leetcode 136

class Solution {
    public int singleNumber(int[] nums) {
    
    int sum = 0;
    ArrayList<Integer> visited = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (visited.contains(nums[i])) {
            sum -= nums[i];
        } 
        else {
            visited.add(nums[i]);
            sum += nums[i];
        }
    }
    return sum;
}

    
}