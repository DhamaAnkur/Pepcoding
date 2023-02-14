
//Leetcode (5) Longest palondrome substring
//Link (https://leetcode.com/problems/longest-palindromic-substring/)

class Main {

    public String longestPalindrome(String s) {
        if (s.length()<=1) return s ; 
        int n = s.length();
        int st = 0, end = 0;
        int max_len = 1;

       for(int i=0; i<n-1 ; i++){
           int l =i;
           int r= i; 
           while(l>=0 && r<n){
               if(s.charAt(l) == s.charAt(r)){
                   l--;
                   r++;
               }
               else
                   break ;

           }

           int len  = r-l-1;
           if(len>max_len){
               max_len = len ;
               st = l+1;
               end = r-1;
           }
       }
        
         for(int i=0; i<n-1 ; i++){
           int l = i;
           int r = i+1; 
           while(l>=0 && r<n){
               if(s.charAt(l) == s.charAt(r)){
                   l--;
                   r++;
               }
               else
                   break ;
               
           }

           int len  = r-l-1;
           if(len>max_len){
               max_len = len ;
               st = l+1;
               end = r-1;
           }
       }

            return s.substring(st,end+1);

    }
}