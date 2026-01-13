class Solution {
    public int earliestTime(int[][] tasks) {
        int tym = Integer.MAX_VALUE;
        for(int[] i: tasks){
            tym = Math.min(tym, i[1] + i[0]);
        }
        return tym;
    }
}