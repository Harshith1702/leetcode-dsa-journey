class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++){
            int Tsa=(i+1)*(n-i);
            int Osa=(Tsa+1)/2;
            sum+=arr[i]*Osa;
        }
        return sum;
    }
}