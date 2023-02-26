
//Leetcode (599). Minimum Index Sum of Two Lists
//Link of Question ( https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/ )
import java.util.*;
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String ,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE ; 

        for(int i=0; i<list1.length ; i++){
            map.put(list1[i] , i);
        }

        for(int i=0; i<list2.length ; i++){
            if(map.containsKey(list2[i])){
                int sum = map.get(list2[i]) + i ; 

                if(sum < minSum){
                ans.clear();
                ans.add(list2[i]);
                minSum = sum;
                }

                else if(sum == minSum){
                    ans.add(list2[i]);
                }

            }
        }

    return ans.toArray(new String[0]);

    }
}

