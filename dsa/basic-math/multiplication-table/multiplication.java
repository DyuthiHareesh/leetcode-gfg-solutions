class Solution {
    // Define the expected method
    public  static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            result.add(n * i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> result=getTable(n);
        System.out.println(result);
    }
}
