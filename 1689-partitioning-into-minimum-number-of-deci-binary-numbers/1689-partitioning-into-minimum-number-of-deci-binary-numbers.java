class Solution {
    public int minPartitions(String n) {
        int max_digit=0;
        for(char c:n.toCharArray()){
            int digit=c-'0';
            if(digit>max_digit)   max_digit=digit;
            if(max_digit==9)  return 9;
        }
        return max_digit;
    }
}