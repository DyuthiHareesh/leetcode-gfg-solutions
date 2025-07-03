class Solution {
    public int TotalPairs(int[] nums, int k) {
       Arrays.sort(nums); 
        int n = nums.length;
        int count = 0;

        if (k == 0) {
           
            for (int i = 1; i < n; i++) {
                if (nums[i] == nums[i - 1]) {
                    count++;  
                    
                    while (i + 1 < n && nums[i] == nums[i + 1]) {
                        i++;
                    }
                }
            }
        } else {
            
            int left = 0, right = 1;

            while (right < n) {
                if (left == right) {
                    right++; 
                    continue;
                }

                int diff = nums[right] - nums[left];

                if (diff < k) {
                    right++;
                } else if (diff > k) {
                    left++;
                } else {
                    count++; 

                    int leftVal = nums[left];
                    int rightVal = nums[right];

                    
                    while (left < n && nums[left] == leftVal) {
                        left++;
                    }

                    
                    while (right < n && nums[right] == rightVal) {
                        right++;
                    }
                }
            }
        }

        return count;
        
    }
}