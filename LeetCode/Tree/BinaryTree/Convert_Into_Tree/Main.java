
//  Definition for a binary tree node.


 //Leetcode 108 converted sorted array to Binary Tree
 // Link of Question( https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ )

 
 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

 public class Main {
    
    public TreeNode createBST(int[]nums , int i ,int j){
          if(i>j )
          return null ;
        
        int mid =  i + (j-i)/2 ;
        
         TreeNode node = new TreeNode (nums[mid]);    
     node.left = createBST(nums , i, mid-1);
     node.right = createBST(nums , mid+1 ,j);
        
        return node;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length == 0)
          return null;
             
        return createBST(nums , 0 , nums.length-1);
    }
}
