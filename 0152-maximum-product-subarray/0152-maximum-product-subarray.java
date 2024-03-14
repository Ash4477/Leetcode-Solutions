class Solution {
    public int maxProduct(int[] nums) {
        
        if (nums.length == 1){
            return nums[0];
        }
       
        int currentProduct = 1;
        int maxProduct = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0){
                currentProduct = 1;
                continue;
            }
            currentProduct *= nums[i];
            if (maxProduct < currentProduct) {
                maxProduct = currentProduct;
            }
            if (maxProduct < nums[i]) {
                maxProduct = nums[i];
            }
        }
        
        currentProduct = 1;
        
         for (int i=nums.length-1; i > 0; i--) {
            if (nums[i] == 0){
                currentProduct = 1;
                continue;
            }
            currentProduct *= nums[i];
            if (maxProduct < currentProduct) {
                maxProduct = currentProduct;
            }
        }
        
        return maxProduct;
    }
}