class Solution {
    public void moveZeroes(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0){
            return;
        }
        int j = 0;
        int i = 0;
        for(; i < length; i++) {
            if (nums[i] != 0) {
                if(i > j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
        
    }
}
