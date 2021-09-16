// https://leetcode.com/problems/third-maximum-number

class Solution {
    public int thirdMax(int[] nums) {
        int steps = 2;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int result = max;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < result) {
                result = nums[i];
                steps--;
                if(steps == 0) {
                    return result;
                }
            }
        }
        return max;
    }
}