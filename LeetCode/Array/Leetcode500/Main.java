
//Leetcode 500. Keyboard Row
//Link of Question( https://leetcode.com/problems/keyboard-row/description/ )

import java.util.*;
class Main {
    public String[] findWords(String[] words) {
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";

        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        HashSet<Character> hs3 = new HashSet<>();

        for(int i=0 ; i<row1.length(); i++){
            hs1.add(row1.charAt(i));
        }
        for(int i=0 ; i<row2.length(); i++){
            hs2.add(row2.charAt(i));
        }
        for(int i=0 ; i<row3.length(); i++){
            hs3.add(row3.charAt(i));
        }

        ArrayList<String> al = new ArrayList<>();

        for(int j=0 ; j<words.length ; j++){
            String str = words[j];
            int x = 0;
            int y = 0;
            int z = 0;

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(hs1.contains(ch)){
                    x++;
                }
                if(hs2.contains(ch)){
                    y++;
                }
                if(hs3.contains(ch)){
                    z++;
                }
            }

            if(x==str.length() || y==str.length() || z==str.length()){
                al.add(str);
            }

        }

        String []ans = new String[al.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = al.get(i);
        }
        return ans;
    }
}