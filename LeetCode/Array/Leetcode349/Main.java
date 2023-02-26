
//Leetcode 349. Intersection of Two Arrays
//Link of Question( https://leetcode.com/problems/intersection-of-two-arrays/description/ )
import java.util.*;
class Solution {

    public static int removeDuplicate(int[] arr) {
       int[] temp = new int[arr.length];
       int i = 0, j = 0;
       temp[j++] = arr[i++];
       for (i = 1; i < arr.length; i++) {
           if (arr[i] != arr[i - 1]) {
               temp[j++] = arr[i];
           }
       }

       for (int k = 0; k < j; k++) {
           arr[k] = temp[k];
       }

       return j;
   }

   public int[] intersection(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);

       int n = removeDuplicate(nums1);
       int m = removeDuplicate(nums2);

       int length = 0;

       for (int i = 0; i < n; i++) {
           int count = 0;
           for (int j = 0; j < m; j++) {
               if (nums1[i] == nums2[j] && count == 0) {
                   count++;
               }
           }

           length += count;
       }

       int k=0;
       int[] arr = new int[length];
       for (int i = 0; i < n; i++) {
           int count = 0;
           for (int j = 0; j < m; j++) {
               if (nums1[i] == nums2[j] && count == 0) {
                   arr[k] = nums1[i];
                   count++;
                   k++;
               }
           }
       }
  
       return arr;
   }
}