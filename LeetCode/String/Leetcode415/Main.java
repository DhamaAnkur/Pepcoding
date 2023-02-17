

//Leetcode 415 Add Strings  , (num1 = "123" , num2 = "458" , o/p= 581)
//Link of Question( https://leetcode.com/problems/add-strings/ )

class Main {

    public static void main(String[] args) {
        String  a = "456";
        String b = "124";
        addStrings(a,b);
    }

    public static void addStrings(String num1, String num2) {
        StringBuilder sb  = new StringBuilder();
        int alen = num1.length()-1;
        int blen = num2.length()-1;
        int carry = 0;

        while(alen >=0 || blen>=0 || carry >= 1){
            if(alen>=0){
                carry += num1.charAt(alen) - '0';
                alen--;
            }

           if(blen>=0){
                carry += num2.charAt(blen)- '0';
                blen--;
             }

            sb.insert(0 , carry%10);
            carry /= 10;

        }

         System.out.print(sb.toString());

    }
}