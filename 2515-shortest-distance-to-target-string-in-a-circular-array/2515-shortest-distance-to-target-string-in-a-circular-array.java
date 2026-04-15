class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int min_dist = n;
        for (int i = 0;i < n;i++) {
            if(words[i].equals(target)) {
                int diff = Math.abs(i - startIndex);
                int dist = Math.min(diff,n - diff);
                if(dist == 0)   return 0;
                if(dist < min_dist)   min_dist = dist;
            }
        }
        if (min_dist == n)    return -1;
        return min_dist;
    }
}