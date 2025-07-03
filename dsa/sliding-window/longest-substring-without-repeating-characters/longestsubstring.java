class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            char currentChar = s.charAt(right);

         
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

          
            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}