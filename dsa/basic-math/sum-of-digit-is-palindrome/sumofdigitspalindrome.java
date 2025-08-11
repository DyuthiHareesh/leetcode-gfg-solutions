// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
     int sum=0;
     
     while(n>0){
         sum+=n%10;
         n=n/10;
     }
     
     
     int original=sum;
     int reversed=0;
     
     while(sum>0){
         reversed=reversed*10+sum%10;
         sum=sum/10;
     }
     
     if(original==reversed){
         return true;
     }
     else{
         return false;
     }
            
    }
}