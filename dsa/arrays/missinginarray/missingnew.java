class Solution {
    int missingNum(int arr[]) {
        
        int n = arr.length+1;
        int xor =0;
        
        for(int i =1;i<=n;i++){
            xor = xor^i;
        }
        
        for(int num : arr){
            xor  = xor^num;
        }
        
        return xor;
    }
}