class Solution {
    public int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            int needed = sum - k;

            if (map.containsKey(needed)) {
                int length = i - map.get(needed);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}