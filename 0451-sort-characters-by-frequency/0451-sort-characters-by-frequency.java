class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[62];//26+26+10
        for(char c:s.toCharArray()){
            if(c>='A' && c<='Z')
                freq[c-'A']++;
            else if(c>='a' && c<='z')
                freq[c-'a'+26]++;
            else
                freq[c-'0'+52]++;//digits
        }

        List<Integer>[] bucket=new List[s.length()+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i]=new ArrayList<>();//i acts as freq!
        }
        for(int i=0;i<62;i++)
            if(freq[i]>0)   bucket[freq[i]].add(i);
        
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            for(int x:bucket[i]){
                char c;
                if(x<26)    c=(char)('A'+x);
                else  if(x<52)  c=(char)('a'+x-26);
                else    c=(char)('0'+x-52);

                for(int j=0;j<i;j++)
                    sb.append(c);//add char which appears <i times!!!
            }
        }
        return sb.toString();

    }
}