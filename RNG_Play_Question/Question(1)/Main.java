
/*
 *  Q 3. Write a programme to sort an array of numbers. Ex. [5, 100, 4, 66, 7, 9, 0, 1, 0, 100, 3, 4, 100]
The output should not contain the repeating numbers and numbers fully divisible 3.
 * Example - [0,1,4,5,7,100]
 */

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        boolean flag = false;
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> finalAns = new ArrayList<>();

        int[] input = { 5, 100, 4, 66, 7, 9, 0, 1, 0, 100, 3, 4, 100 };

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 0; i < input.length; i++) {
            if ((input[i]) % 3 != 0) {
                ans.add(input[i]);
            }
        }

        for( int i = 0; i<ans.size() ; i++){
            if(i<ans.size()-1){
            if(ans.get(i) != ans.get(i+1)){
                finalAns.add(ans.get(i));
            }
        }

        }
       
        int ans2 = ans.size()-1;
        finalAns.add(ans.get(ans2));

        System.out.print(finalAns);

    }

}
