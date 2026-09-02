class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<>();

        int L = 0;
        int maxLength = 0;

        for (int R = 0; R < s.length(); R++) {

            while (set.contains(s.charAt(R))) {
                set.remove(s.charAt(L));
                L++;
            }

            set.add(s.charAt(R));

            int length = R - L + 1;

            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}