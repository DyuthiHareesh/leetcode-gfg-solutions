class Solution {
    public int maxDepth(String s) {
       int currentdepth=0;
       int maxdepth=0;
       for(char ch:s.toCharArray()){
        if(ch=='('){
            currentdepth++;
            maxdepth=Math.max(maxdepth,currentdepth);
        }
        else if(ch==')'){
            currentdepth--;
        }
       }

       return maxdepth;
    }
}