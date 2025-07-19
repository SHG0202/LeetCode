class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_area = 0;
        int min_height = 0;

        while(left < right){
            int area = (right-left)*Math.min(height[left], height[right]);
            max_area = Math.max(max_area, area);

            min_height = Math.min(height[left], height[right]);
            
            while(left < right && height[left] <= min_height){
                left++;
            }

            while(left < right && height[right] <= min_height){
                right--;
            }
        }

        return max_area;
    }
}