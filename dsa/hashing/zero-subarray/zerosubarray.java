class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
     
     
     HashSet<Integer> set = new HashSet<>();
     
     int sum =0;
     set.add(0);
     
     
     for(int num:arr){
         sum = sum+num;
         
         if(set.contains(sum)){
             return true;
         }
         set.add(sum);
     }
     
     return false;
    }
}