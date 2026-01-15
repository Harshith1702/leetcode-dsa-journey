class Solution {
    public int minDeletionSize(String[] strs) {
        int rows=strs.length,columns=strs[0].length();
        int cnt=0;
        for(int c=0;c<columns;c++){
            for(int r=1;r<rows;r++){
                if(strs[r].charAt(c)<strs[r-1].charAt(c)){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}