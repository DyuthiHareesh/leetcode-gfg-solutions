class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isAlreadyInResult = false;

            // Check if this number is already added to the result list
            for (int x : result) {
                if (x == arr[i]) {
                    isAlreadyInResult = true;
                    break;
                }
            }

            // If not already in result, check if it appears again later in the array
            if (!isAlreadyInResult) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        result.add(arr[i]); // Found duplicate
                        break; // Add only once
                    }
                }
            }
        }

        return result;
    }
}
