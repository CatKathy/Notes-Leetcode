class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
								// 题目要求的索引是从 1 开始的
                return new int[]{left+1, right+1};
            } else if (sum < target){
                left++;
            } else if (sum > target){
                right--;
            }
        }
        return new int[]{-1, -1};
        
    }
}
