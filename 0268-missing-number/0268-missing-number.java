class Solution {
    public int missingNumber(int[] nums) {
        boolean[] checkArray = new boolean[nums.length + 1];
        
        for (int x : nums) {
            checkArray[x] = true;
        }
        
        for (int i = 0; i < checkArray.length; i++) {
            if (checkArray[i] == false) {
                return i;
            }
        }
        
        return nums.length;
    }
}