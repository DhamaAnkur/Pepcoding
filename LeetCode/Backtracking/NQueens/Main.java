// Leetcode 51 M-Queens
//Link of Question ( https://leetcode.com/problems/n-queens/description/ )


class Solution {

    public static boolean isSafe(char[][]board , int col, int row){
    int n = board.length;

    for(int j=0 ; j<n ; j++){
        if(board[row][j] == 'Q'){
            return false;
        }
    }

     for(int i=0; i<n; i++){
        if(board[i][col] == 'Q'){
            return false;
        }
    }

     int r = row ;     ///   Upper Left
     for(int c=col; c>=0 && r>=0 ; c--,r--){
        if(board[r][c] == 'Q'){
            return false;
        }
    }


    r = row ;   // upper right
        for(int c=col; c<n && r>=0 ; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

    r = row ;    // lower left
        for(int c=col; c>=0 && r<n ; c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        for(int c=col; c<n && r<n ; c++,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }


    return true ;
    }

    public static void solve(char[][]board ,  List<List<String>> allboard){
        String row = "";
        List<String> newboard = new ArrayList<>();
        
        for(int i=0 ; i<board.length; i++){
            row = "";
            for(int j=0 ; j<board.length ; j++){

                if(board[i][j] == 'Q'){
                    row += "Q";
                }
                else{
                    row += '.';
                }

            }
            newboard.add(row);
        }
        allboard.add(newboard);
    }

public static void helper(char[][]board , List<List<String>> allboard ,int col){
    if(col == board.length){
        solve(board ,allboard);
        return ;
    }
 
    for(int row= 0; row<board.length ; row++){
        if(isSafe(board, col , row)){
            board[row][col] = 'Q';
            helper(board , allboard , col+1);
            board[row][col] = '.';
        }
    }

} 

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboard = new ArrayList<>();
        char [][]board = new char[n][n];
        helper(board , allboard , 0);
        return allboard ;
    }


}