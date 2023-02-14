
//Leetcode (49)
//Link of Question( https://leetcode.com/problems/group-anagrams/ )

import java.util.*;

class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> fmap = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }

            if (bmap.containsKey(fmap) == false) {
                ArrayList<String> al = new ArrayList<>();
                al.add(str);
                bmap.put(fmap, al);
            }

            else {
                ArrayList<String> al = bmap.get(fmap);
                al.add(str);
            }

        }

        List<List<String>> ans = new ArrayList<>();
        for (ArrayList<String> list : bmap.values()) {
            ans.add(list);
        }

        return ans;

    }
}