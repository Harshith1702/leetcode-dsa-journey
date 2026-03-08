class Solution {
    public int minOperations(String s) {
        int n=s.length();
        char[] ar=s.toCharArray();
        Arrays.sort(ar);
        String str=new String(ar);//sorted string

        if(str.equals(s))  return 0;//already sorted
        else{
            if(s.charAt(0)==str.charAt(0) || s.charAt(n-1)==str.charAt(n-1))    
                return 1;//1st or last already sorted
            if(n==2)    return -1;
        
            int p1=-1,p2=-1;
            for(int i=0;i<n;i++){
                if(p1==-1 && s.charAt(i)==str.charAt(0))    p1=i;//1st position of smallest character
                if(s.charAt(i)==str.charAt(n-1))    p2=i;//last pos.. of largest character
            }
            if(p2==0 && p1==n-1)    return 3;//reverse case
        }
        return 2;//last
    }
}