class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<prices.length;i++){
            while(!s.isEmpty() && prices[s.peek()]>=prices[i]){
                prices[s.pop()]-=prices[i];
            }
            s.push(i);
        }
        return prices;
    }
}