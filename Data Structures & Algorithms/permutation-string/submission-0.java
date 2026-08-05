class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // char[] s1Arr=s1.toCharArray();
        // Arrays.sort(s1);
        // String sortedS1=new String(s1Array);

        // for(int i =0;i<s2.length();i++){
        //     for(int j=0;j<s2.length();j++){
        //         char[] subStrArr =s2.sbstring(i,j+1).toCharArray();
        //         Arrays.sort(subStrArr);
        //         String sortedSubStr = new String(subStrArr);
        //         if(sortedSubStr.equals(sortedS1)){return true;}
        //     }
        // }
        // return false;





        Map<Character, Integer> count1=new HashMap<>();
        for(char c:s1.toCharArray()){
            count1.put(c, count1.getOrDefault(c,0)+1);
        }
        int need= count1.size();
        for(int i=0;i<s2.length();i++){
            HashMap<Character, Integer> count2= new HashMap<>();
            int cur=0;
            for(int j=i;j<s2.length();j++){
                char c=s2.charAt(j);
                count2.put(c, count2.getOrDefault(c,0)+1);
                if(count1.getOrDefault(c,0)< count2.get(c)){
                    break;
                }
                if(count1.getOrDefault(c,0)==count2.get(c)){
                    cur++;

                }
                if(cur==need){
                    return true;
                }
                
            }
        }
        return false;








    }
}
