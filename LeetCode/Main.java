// package LeetCode;

public class Main {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "456";

        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int n = x * y;

        StringBuilder ans = new StringBuilder();
        while (n != 0) {
            ans.insert(0, n % 10);
            n /= 10;
        }
        System.out.println(ans);

    }
}
