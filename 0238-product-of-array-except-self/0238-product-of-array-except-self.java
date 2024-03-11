class Solution {
    int index = 0;
    public int[] productExceptSelf(int[] nums) {
        
        int totalProd = nums[0];
        int[] answer = new int[nums.length];
        
        for (int i = 1; i < nums.length; i++) {        
            if (i == nums.length-1) {
                answer[i] = totalProd;
            }
            
            else {
                int val = nums[i];
                answer[i] = totalProd;
                totalProd *= val;
            }
        }
        
        totalProd = nums[nums.length-1];
        
        for (int i = nums.length-2; i > 0; i--) {
            answer[i] *= totalProd;
            totalProd *= nums[i];
        }
        
        answer[0] = totalProd;
        
        return answer;
    }
}