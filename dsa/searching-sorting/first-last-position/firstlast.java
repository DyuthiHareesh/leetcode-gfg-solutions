class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);
        return new int[] {first,last};
    }



    private int findFirst(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                index=mid;
                high=mid-1;
            }

            else if(target<nums[mid]){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }
        return index;
    }


    private int findLast(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int index=-1;


        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                index=mid;
                low=mid+1;
            }

            else if(target<nums[mid]){
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }
        return index;
    }

}