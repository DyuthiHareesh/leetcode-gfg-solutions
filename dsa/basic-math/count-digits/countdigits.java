class Solution {
    static int evenlyDivides(int n) {
        int count = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n = n / 10; 
        }
        return count;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=evenlyDivides(n);
        System.out.println(result);
    }
}