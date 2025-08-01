class Solution {
    String reverseEqn(String S) {
        StringBuilder result = new StringBuilder();
        int i = S.length() - 1;

        while (i >= 0) {
            char ch = S.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the full number (could be multi-digit)
                StringBuilder num = new StringBuilder();

                while (i >= 0 && Character.isDigit(S.charAt(i))) {
                    num.append(S.charAt(i));  // Collect digits in reverse
                    i--;
                }

                // Reverse digits to correct the number and add to result
                result.append(num.reverse());
            } else {
                // Operator → directly add to result
                result.append(ch);
                i--;
            }
        }

        return result.toString();
    }
}
