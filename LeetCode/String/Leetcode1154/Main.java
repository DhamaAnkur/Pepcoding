//1154. Day of the Year
//Link of Question( https://leetcode.com/problems/day-of-the-year/ )

class Solution {
    public int dayOfYear(String date) {
        date = date.replaceAll("-", "");

        String StringYear = "";
        for(int i=0; i<4; i++){
            StringYear += date.charAt(i);
        }
        int year = Integer.parseInt(StringYear);

        String SMonth = "";
        for(int i=4 ; i<6; i++){
         SMonth += date.charAt(i);
        }
        int month = Integer.parseInt(SMonth);
    
        String Sdate = "";
        for(int i=6 ; i<8; i++){
         Sdate += date.charAt(i);
        }
        int Date = Integer.parseInt(Sdate);
        int ans = 0;
    
        if(year%4 == 0){
             int[]arr  = {0,31 ,60 ,91 ,121 ,152 ,182 ,213 ,244 ,274 ,305 ,335 ,366};
             ans =  Date + arr[month-1];
        }

        else{
        int[]arr  = {0,31 ,59 ,90 ,120 ,151 ,181 ,212 ,243 ,273 ,304 ,334 ,365};
            ans =  Date + arr[month-1];
        }

        return ans ;
        
        
    }
}