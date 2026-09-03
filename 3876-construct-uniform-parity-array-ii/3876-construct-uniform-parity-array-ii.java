class Solution {
    public boolean uniformArray(int[] nums1) {
        //Either entire array is even or min is odd
        int min = nums1[0];
        boolean even = true;
        for (int x : nums1){
            if (x < min)    min = x;
            if (x % 2 == 1) even = false;           
        }
        return (min % 2 != 0) || even;
    }
}