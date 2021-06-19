class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int start=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                start=Math.max(start,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}
