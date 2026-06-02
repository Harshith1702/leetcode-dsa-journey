class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int res = Integer.MAX_VALUE;
        //land to water
        for (int i = 0;i < landStartTime.length; i++) {
            int lfinish = landStartTime[i] + landDuration[i];
            for (int j = 0;j < waterStartTime.length; j++) {
                int finish = Math.max(lfinish, waterStartTime[j]) + waterDuration[j];
                res = Math.min(res, finish);
            }
        }
        // reverse
        for (int i = 0;i < waterStartTime.length; i++) {
            int wfinish = waterStartTime[i] + waterDuration[i];
            for (int j = 0;j < landStartTime.length; j++) {
                int finish = Math.max(wfinish, landStartTime[j]) + landDuration[j];
                res = Math.min(res, finish);
            }
        }
        return res;
    }
}