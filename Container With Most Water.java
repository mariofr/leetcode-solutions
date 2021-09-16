// https://leetcode.com/problems/container-with-most-water

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;
        while(left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if(maxarea < area)
                maxarea = area;
            if(height[left] >= height[right])
                right--;
            else
                left++;
        }
        return maxarea;
    }
}