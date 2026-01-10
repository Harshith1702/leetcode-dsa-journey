class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        int[] dp=new int[m+1];
        for(int i=n-1;i>=0;i--){
            int prev=0;
            for(int j=m-1;j>=0;j--){
                int temp=dp[j];
                if(s1.charAt(i)==s2.charAt(j))
                    dp[j]=s1.charAt(i)+prev;
                else
                    dp[j]=Math.max(dp[j],dp[j+1]);
                prev=temp;
            }
        }
        int sum=0;
        for(char c:s1.toCharArray())    sum+=c;
        for(char c:s2.toCharArray())    sum+=c;

        return sum-2*dp[0];
    }
}