class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())     return false;
        int[] s1freq=new int[26];
        int[] s2freq=new int[26];
        for(char c:s1.toCharArray()){
            s1freq[c-'a']++;
        }
        int n=s1.length();
        int k=s2.length();
        for(int i=0;i<k;i++){
            s2freq[s2.charAt(i)-'a']++;
            if(i>=n)    s2freq[s2.charAt(i-n)-'a']--;
            if(Yes(s1freq,s2freq))  return true;
        }
        return false;
    }
    private static boolean Yes(int[] a,int[] b){
        for(int i=0;i<26;i++)
            if(a[i]!=b[i])  return false;
        return true;
    }
}