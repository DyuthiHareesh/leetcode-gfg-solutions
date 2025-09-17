// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int largest = -1;

        // Step 1: Divide out all 2s
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }

        // Step 2: Divide out all odd numbers from 3 onwards
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        // Step 3: If n is a prime number greater than 2
        if (n > 2)
            largest = n;

        return largest;
        
    }
}