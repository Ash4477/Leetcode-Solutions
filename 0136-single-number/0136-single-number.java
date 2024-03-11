class Solution {
    public int singleNumber(int[] nums) {
        boolean[] checkArray = new boolean[nums.length];

         HashMap<Integer, Boolean> checker = new HashMap<>();

         for (int val : nums){
             if (checker.get(val) == null){
                 checker.put(val,true);
             }

             else if (checker.get(val) == true) {
                 checker.put(val,false);
             }
         }

         for (int val: nums){
             if (checker.get(val) == true) {
                 return val;
             }
         }

         return -1;
    }
}