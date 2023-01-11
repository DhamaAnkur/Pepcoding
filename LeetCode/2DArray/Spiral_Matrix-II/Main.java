
//Leetcode-59 Siral Matrix II 
// Link of Question( https://leetcode.com/problems/spiral-matrix-ii/ )

class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0){
            int[][]ans  = new int[0][0];
            return ans;
        }

        else if(n==1){
            int[][]ans1 = {{1}};
            return ans1;
        }

        else{
        int[][] arr = new int[n][n];
        int minR = 0;
        int minC = 0;
        int maxR = n-1;
        int maxC = n-1;
        int count= 1 ;

        while(count <= n*n){

            for(int i=minC ; i<=maxC ; i++){
             arr[minR][i] = count++;
            }
            minR++;

            for(int i=minR ; i<=maxR ; i++){
                arr[i][maxC] = count++;
            }
            maxC--;

            for(int i=maxC; i>=minC; i--){
                arr[maxR][i] = count++;
            }
            maxR--;

            for(int i=maxR ; i>=minR; i--){
                arr[i][minC] = count++;
            }
            minC++;

        }

     return arr;

        }

    }
}