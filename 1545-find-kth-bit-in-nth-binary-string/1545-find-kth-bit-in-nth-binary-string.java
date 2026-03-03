class Solution {
    public char findKthBit(int n, int k) {
        int flip=0;
        //LEFT | 1 | RIGHT (order)
        while(n>1){
            int mid=1<<(n-1);

            if(k==mid){
                return (flip%2==0)? '1':'0';
            }//middle

            if(k>mid){
                k=(1<<n)-k;
                flip++;
            }//RIGHT i.e, reverse(invert(LEFT))
            n--;
        }
        return (flip%2==0)? '0':'1';
    }
}