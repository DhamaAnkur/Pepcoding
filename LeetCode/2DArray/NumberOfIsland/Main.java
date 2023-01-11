 
//Leetcode-200 Number of Island

class Solution {
    
    int [][]dir = {{1,0} , {0,1} , {-1,0} ,{0,-1}};
    
    public void dfs(char[][] grid, int i, int j){
        grid[i][j] = '0';
        
        for(int [] d : dir){
             int r = i + d[0];
            int c = j + d[1];
            
            if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == '1' ){
                dfs(grid , r, c);
            }
        }
        
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;
        int ans =0;

        
        for(int i=0; i<n ; i++){
        for(int j=0; j<m ; j++){
            
             if(grid[i][j]=='1'){
              ans++ ;
              dfs(grid , i , j);
          }        
       
        }
        }
     
        return ans;
        
        }
}