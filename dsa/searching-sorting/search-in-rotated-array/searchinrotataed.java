class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                return true;
            }
      //if there are duplicates...[1,1,1,0,1,1,1]
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low++;
                high--;
            }
//if left half is sorted
            else if(nums[low]<=nums[mid]){
                    if(nums[low]<=target&&target<nums[mid]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
            }
//if right half is sorted
            else{
                if(nums[mid]<target&&target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

        }
        return false;

    }
}
