class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
           //Since the array is rotated, if mid > high, then mid must be part of the left side, and the minimum lies to the right.
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
//The right half is sorted, so the minimum must be on the left, possibly at mid.
            else if(nums[mid]<nums[high]){
                high=mid;
            }
        //nums[mid] == nums[high]
            else{
                high--;
            }
        }

        return nums[low];
    }
}
