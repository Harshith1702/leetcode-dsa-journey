class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=0,ele2=0;
        int c1=0,c2=0;
        for(int x:nums){
            if(ele1!=0 && x==ele1)  c1++;
            else if(ele2!=0 && x==ele2)  c2++;
            else if(c1==0){
                ele1=x;
                c1++;
            }
            else if(c2==0){
                ele2=x;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        c1=0;
        c2=0;
        for(int x: nums){
            if(x==ele1) c1++;
            else if(x==ele2)    c2++;
        }
        if(c1>n/3)  res.add(ele1);
        if(c2>n/3)  res.add(ele2);
        return res;
    }
}