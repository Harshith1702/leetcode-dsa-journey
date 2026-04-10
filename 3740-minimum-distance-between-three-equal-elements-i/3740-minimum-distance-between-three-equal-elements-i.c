int minimumDistance(int* nums, int numsSize) {
    int res = 1e9, a[100001], b[100001];
    for(int i = 0;i <= 100000;i++){
        a[i] = -1;
        b[i] = -1;
    }
    for(int i = 0;i < numsSize;i++){
        int h = nums[i];
        if(b[h] != -1){
            int d = abs(a[h] - b[h]) + abs(i - a[h]) + abs(i - b[h]);
            if(d < res)   res = d;
        }
        b[h] = a[h];
        a[h] = i;
    }
    if(res == 1e9)   return -1;
    return res;
}