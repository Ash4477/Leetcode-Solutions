class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (m < 1 && m+n<=1) {
            nums1[0] = nums2[0];
            return;
        }
        
        if (n < 1 && m+n<=1) {
            return;
        }
        
        int idx1 = 0, idx2 = 0;
        
        while (idx1 < m && idx2 < n) {         
             if (nums1[idx1] >= nums2[idx2]) {
                shift(nums1,idx1);
                nums1[idx1] = nums2[idx2];
                idx1++;
                idx2++;
                m++;
            }
            else {
                idx1++;
            }
        }
        
        while (idx2 < n) {
            nums1[idx1++] = nums2[idx2++];   
        }
    }
    
    private void shift(int[] nums, int idx) {
        int i = nums.length-1;
        while (i > idx) {
            nums[i] = nums[i-1];
            i--;
        }
    }
}