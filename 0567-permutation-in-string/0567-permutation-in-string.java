class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())     return false;
        int[] freq=new int[26];
        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
        int l=0;//left
        for(int r=0;r<s2.length();r++){//right
            freq[s2.charAt(r)-'a']--;
            while(freq[s2.charAt(r)-'a']<0){
                freq[s2.charAt(l)-'a']++;
                l++;
            }
            if(r-l+1==s1.length())  return true;
        }
        return false;
    }
}