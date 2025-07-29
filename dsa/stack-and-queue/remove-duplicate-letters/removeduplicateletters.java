class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        // Step 1: Record the last occurrence index of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // Step 2: Process each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character is already in stack, skip it
            if (seen[c - 'a']) continue;

            // While current character is smaller than stack top
            // and top character appears again later, pop it
            while (!stack.isEmpty() && c < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                seen[stack.pop() - 'a'] = false;
            }

            // Add current character to stack and mark as seen
            stack.push(c);
            seen[c - 'a'] = true;
        }

        // Step 3: Build result from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}
