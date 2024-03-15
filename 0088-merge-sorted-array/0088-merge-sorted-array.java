class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] newArr = new int[m+n];
        int idx1 = 0, idx2 = 0, idx = 0;
        
        while (idx1 < m && idx2 < n) {         
            if (nums1[idx1] < nums2[idx2]) {
                newArr[idx++] = nums1[idx1++];
            }
            
            else if (nums2[idx2] < nums1[idx1]) {
                newArr[idx++] = nums2[idx2++];
            }
                
            else {
                newArr[idx++] = nums1[idx1++];
                newArr[idx++] = nums2[idx2++];
            }
        }
        
         while (idx1 < m) {
            newArr[idx++] = nums1[idx1++];   
        }

        while (idx2 < n) {
            newArr[idx++] = nums2[idx2++];   
        }
        
        for (int x = 0; x < m+n ; x++) {
            nums1[x] = newArr[x];
        }
    }
}