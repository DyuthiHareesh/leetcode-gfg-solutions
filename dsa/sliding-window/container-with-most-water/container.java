class Solution {
    public int maxArea(int[] height) {

        int L = 0;
        int R = height.length - 1;
        int maxArea = 0;

        while (L < R) {

            int width = R - L;
            int h = Math.min(height[L], height[R]);

            int area = width * h;

            maxArea = Math.max(maxArea, area);

            if (height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return maxArea;
    }
}