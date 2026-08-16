class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] a = new int[n];
        int[] b = new int[n];
        a = SmallEleRyt(heights,n);
        b = SmallEleLft(heights,n);
        int res = 0;
        for (int i = 0;i < n; i++) {
            res = Math.max((a[i] - b[i] - 1) * heights[i], res);
        }    
        return res;
    }
    public static int[] SmallEleRyt(int[] arr,int n) {
        Stack<Integer> s= new Stack<>();
        int[] a = new int[n];
        Arrays.fill(a, n);
        for (int i = 0;i < n; i++) {
            while(!s.isEmpty() && arr[s.peek()] > arr[i]) {
                a[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        return a;
    }
    public static int[] SmallEleLft(int[] arr,int n) {
        Stack<Integer> s= new Stack<>();
        int[] b = new int[n];
        Arrays.fill(b, -1);
        for (int i = n - 1;i >= 0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                b[s.peek()] = i;
                s.pop();
            }
            s.push(i);
        }
        return b;
    }
}