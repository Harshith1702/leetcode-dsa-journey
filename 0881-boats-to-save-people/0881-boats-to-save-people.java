class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int i=0,j=n-1;
        int b=0;//boats
        while(i<j){
            if(people[i]+people[j]<=limit)  i++;
            j--;
            b++;
        }
        if(i==j)    b++;
        return b;
    }
}