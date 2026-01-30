class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n=costs.length;
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=costs[i];
            a[i][1]=capacity[i];
        }
        Arrays.sort(a,(p1,p2)->Integer.compare(p1[0],p2[0]));
        int[] p=new int[n];
        p[0]=a[0][1];
        for(int i=1;i<n;i++){
            p[i]=Math.max(p[i-1],a[i][1]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(a[i][0]<budget)   res=Math.max(res,a[i][1]);
            int rem=budget-a[i][0]-1;
            if(rem<0)   continue;
            int l=0,r=i-1,idx=-1;
            while(l<=r){
                int m=(l+r)/2;
                if(a[m][0]<=rem){
                    idx=m;
                    l=m+1;
                }
                else   r=m-1;
            }
            if(idx>=0)   res=Math.max(res,a[i][1]+p[idx]);
        }
        return res;
    }
}