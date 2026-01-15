class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int h=1,v=1,c=1;
        for(int i=1;i<hBars.length;i++){
            c=(hBars[i-1]+1==hBars[i])? c+1:1;
            h=Math.max(h,c);
        }
        c=1;
        for(int i=1;i<vBars.length;i++){
            c=(vBars[i-1]+1==vBars[i])? c+1:1;
            v=Math.max(v,c);
        }
        int s=Math.min(v,h)+1;
        return s*s;
    }
}