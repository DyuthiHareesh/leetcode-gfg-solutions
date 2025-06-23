class Solution {
     static int addition(int a ,int b){
         int result=a+b;
         return result;
     }
     
     
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int result=addition(a,b);
         System.out.println(result);
     }
}