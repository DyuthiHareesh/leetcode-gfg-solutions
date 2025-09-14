class Solution {
    public int addDigits(int num) {
        int sum=0;
       while(num>0){
           sum+=num%10;
           num=num/10;
       }

         int add=0;
       while(sum>0){
        add+=sum%10;
        sum=sum/10;
       } 

        while (add >= 10) {
            int temp = 0;
            while (add > 0) {
                temp += add % 10;
                add = add / 10;
            }
            add = temp;
        }

        return add;

    }
}