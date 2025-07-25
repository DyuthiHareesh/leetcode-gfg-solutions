class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;        
            sum += digit * digit * digit; 
            n = n / 10;                
        }

        return sum == original; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=armstrongNumber(n);
        System.out.println(result);
    }
}