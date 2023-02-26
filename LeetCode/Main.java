// package LeetCode;

public class Main {
    
    public static void main(String[] args) {
        String s = "123";
        String b = "456";

        int x = Integer.parseInt(s);
        int y = Integer.parseInt(b);

       int a = x*y ;

        StringBuilder ans = new StringBuilder();
        while(a!=0){
            ans.insert(0 , a%10);
            a /= 10;
        }
        System.out.println(ans);


    }
}
