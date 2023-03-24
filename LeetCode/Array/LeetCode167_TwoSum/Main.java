
// Leetcode - 167 ( two sum) ex:- arr= {2,7,9,11} , target = 7 , return index of value of which sum is 7. [0,1]
//  

import java.util.*;

class Main {
    public int[] twoSum(int[] arr, int target) {
        int sum = 0;
        List<Integer> al = new ArrayList<>();
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            sum = arr[i] + arr[j];

            if (sum == target) {
                al.add(i + 1);
                al.add(j + 1);
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }

        }

        int[] ans = new int[al.size()];

        for (int k = 0; k < ans.length; k++) {
            ans[k] = al.get(k);
        }

        return ans;
    }
}