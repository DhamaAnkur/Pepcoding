//383. Ransom Note
// Link of Question ( https://leetcode.com/problems/ransom-note/description/ )

class Solution {
    public boolean canConstruct(String ransome, String magazine) {
        int []arr = new int[26];

        for(char ch : magazine.toCharArray())
            arr[ch - 'a']++;
        
        for(char ch : ransome.toCharArray()){
            if(arr[ch - 'a'] == 0)
                return false;
             arr[ch - 'a']--;

        }
        return true;

    }
}