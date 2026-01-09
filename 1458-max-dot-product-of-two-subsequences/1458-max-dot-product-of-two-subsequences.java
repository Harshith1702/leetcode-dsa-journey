class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        int[][] a=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=m;j++)
                a[i][j]=Integer.MIN_VALUE/2;
        int product;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                product=nums1[i-1]*nums2[j-1];
                a[i][j]=Math.max(product,Math.max(product+a[i-1][j-1],Math.max(a[i-1][j],a[i][j-1])));
            }
        }return a[n][m];
    }
}