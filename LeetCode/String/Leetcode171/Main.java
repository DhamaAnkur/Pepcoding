
//171. Excel Sheet Column Number
// Link of Question( https://leetcode.com/problems/excel-sheet-column-number/description/ )

class Main{
    public int titleToNumber(String str) {
        int ans  = 0;
        int p= 0;

        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            int val  = (int)c - 65 +1;
            ans += val*Math.pow(26 , p);
            p++;
        }
        return ans ;
    }
}