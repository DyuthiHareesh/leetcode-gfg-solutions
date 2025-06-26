class Solution {
    static int countSquares(int n) {
     return (int)Math.sqrt(n-1);
    }
    
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result=countSquares(n);
        System.out.println(result);
    }
}