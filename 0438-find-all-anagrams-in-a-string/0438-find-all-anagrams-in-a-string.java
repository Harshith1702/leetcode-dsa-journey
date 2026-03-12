class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(p.length()>s.length())     return res;
        int[] freq=new int[26];
        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }
        int l=0;//left
        for(int r=0;r<s.length();r++){//right
            freq[s.charAt(r)-'a']--;
            while(freq[s.charAt(r)-'a']<0){
                freq[s.charAt(l)-'a']++;
                l++;
            }
            if(r-l+1==p.length())  res.add(l);
        }
        return res;
    }
}