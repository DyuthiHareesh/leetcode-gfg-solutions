class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        long totalsum=(long)n*(n+1)/2;
        
        long actualsum=0;
        for(int num:arr){
            actualsum+=num;
        }
        
        return (int)(totalsum-actualsum);
        
    }
}