class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }


        Map<Character,Character>mapST=new HashMap<>();
        Map<Character,Character>mapTS= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char C1=s.charAt(i);
            char C2=t.charAt(i);


            if(mapST.containsKey(C1)){
                if(mapST.get(C1)!=C2){
                    return false;
                }
            }
                else{
                    if (mapTS.containsKey(C2)) return false;
                              mapST.put(C1, C2);
                              mapTS.put(C2, C1);
                }
        }


        return true;
    }
}