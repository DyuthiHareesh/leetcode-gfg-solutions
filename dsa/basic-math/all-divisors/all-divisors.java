import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> smallFactors = new ArrayList<>();
        ArrayList<Integer> largeFactors = new ArrayList<>();
        
        // Loop only up to the square root point
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                smallFactors.add(i); // Add the smaller factor
                
                // Add the companion factor only if it's distinct (not a duplicate)
                // For example, if n = 16 and i = 4, n/i is also 4. We don't want to add 4 twice!
                if (i != n / i) {
                    largeFactors.add(n / i);
                }
            }
        }
        
        // Since largeFactors was collected backwards (e.g., 20, 10, 5), 
        // we reverse it to make it ascending (5, 10, 20)
        Collections.reverse(largeFactors);
        
        // Combine both lists together into smallFactors
        smallFactors.addAll(largeFactors);
        
        return smallFactors; // Return the final combined list
    }
}