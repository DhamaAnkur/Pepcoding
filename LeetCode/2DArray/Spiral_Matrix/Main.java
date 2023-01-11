
//Leetcode-54 Spiral Matrix
//Link of Question( https://leetcode.com/problems/spiral-matrix/ )

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length ;

        int minrow = 0;
        int mincol = 0;
        int maxrow = n-1 ;
        int maxcol = m-1 ;
        int count = 0 ;
        List<Integer> ans = new ArrayList<>();

        while(count < (n*m)){

            for(int i=mincol ; i<=maxcol && count < (n*m) ; i++){
                ans.add(matrix[minrow][i]);
                count++;
            }
            minrow++;

            for(int i=minrow ; i<=maxrow && count<(n*m) ; i++){
                ans.add(matrix[i][maxcol]);
                count++;
            }
            maxcol--;

            for(int i=maxcol ; i>=mincol && count<(n*m) ; i--){
                ans.add(matrix[maxrow][i]);
                count++;
            }
            maxrow--;

            for(int i=maxrow ; i>=minrow && count<(n*m) ; i--){
                ans.add(matrix[i][mincol]);
                count++;
            }
            mincol++;

        }

        return ans ;


    }
}