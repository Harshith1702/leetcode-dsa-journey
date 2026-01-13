class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int x:nums1)    s1.add(x);
        for(int y:nums2)    s2.add(y);
        int c1=0,c2=0;
        for(int x:nums1)   if(s2.contains(x))  c1++;
        for(int y:nums2)   if(s1.contains(y))  c2++;
        return new int[]{c1,c2};
    }
}