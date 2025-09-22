import java.util.Arrays;

class GfG {

    static int countPairs(int[] arr, int target) {
        int res = 0;
        int n = arr.length;
        int left = 0, right = n - 1;

        // Sort the array before applying 
        // two-pointer technique
        Arrays.sort(arr);

        while (left < right) {

            // If sum is less than target
            if (arr[left] + arr[right] < target) {
                left++;
            }

            // If sum is more than target
            else if (arr[left] + arr[right] > target) {
                right--;
            }

            // If sum is equal to target
            else {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left], ele2 = arr[right];

                // Count frequency of first element
                while (left <= right && arr[left] == ele1) {
                    cnt1++;
                    left++;
                }

                // Count frequency of second element
                while (left <= right && arr[right] == ele2) {
                    cnt2++;
                    right--;
                }

                // If both elements are same
                if (ele1 == ele2) {
                    res += (cnt1 * (cnt1 - 1)) / 2;
                } else {
                    res += cnt1 * cnt2;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        System.out.println(countPairs(arr, target));
    }
}