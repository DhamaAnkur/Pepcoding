
// leetcode 88


class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int p1=n-1;
        int p2=m-1;
        int i = arr1.length-1;

        while(p2 >= 0){

             if(p1 >= 0 && arr1[p1] > arr2[p2]){
             arr1[i] = arr1[p1];
             i--;
             p1--;
         }

         else{
             arr1[i] = arr2[p2];
             i--;
             p2--;
         }
         
           }

        System.out.println(arr1);

    }
}