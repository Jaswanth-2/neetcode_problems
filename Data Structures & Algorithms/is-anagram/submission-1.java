class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        int c[]=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int i=0;i<c.length;i++){
            if(c[i] != 0){ 
                return false;
                
            }
        }
        return true;
    }
}
