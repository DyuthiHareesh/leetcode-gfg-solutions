import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        // First loop: Encode frequencies using in-place updates
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Second loop: Decode and collect duplicates
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                result.add(i);
            }
        }

        return result;
    }
}
