class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer, Integer> hm = new HashMap<>();
        while (n > 0) {
            int x = n % 10;
            n /= 10;
            hm.put(x,hm.getOrDefault(x,0) + 1);
        }
        int c = 0;
        for (int i : hm.keySet()){
            c += i * hm.get(i);
        }
        return c;
    }
}