class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][] arr = new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        int L=0;
        int R = nums.length-1;

        while(L<R){
            int sum = arr[L][0]+arr[R][0];

            if(sum==target){
                return new int[]{arr[L][1],arr[R][1]};
            }

            else if(sum<target){
                L++;
            }
            else{
                R--;
            }
        }

        return new int[]{};
    }
}