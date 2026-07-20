class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        int xi = 0,yi = 0;
        for (char c : s.toCharArray()) {
            if (c == x)   xi++;
            else if (c == y)   yi++;
            else sb.append(c);
        }
        while (yi-- > 0)   sb.insert(0,y);
        while (xi-- > 0)   sb.append(x);
        return sb.toString();
    }
}