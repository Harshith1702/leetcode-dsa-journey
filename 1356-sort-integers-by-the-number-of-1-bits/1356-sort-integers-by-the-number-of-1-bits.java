class Solution {
    public int[] sortByBits(int[] arr) {
        int base=10000;
        for(int i=0;i<arr.length;i++){
            arr[i]=CountBits(arr[i])*base+arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]%=base;
        }
        return arr;
    }

    public int CountBits(int n){
        int c=0;
        while(n!=0){
            c+=n%2;
            n/=2;
        }
        return c;
    }
}