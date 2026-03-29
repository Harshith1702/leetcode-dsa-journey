class Solution {
    int[] parent, parity;
    public int numberOfEdgesAdded(int n, int[][] edges) {
        parent = new int[n];
        parity = new int[n];
        for (int i = 0;i < n;i++)      parent[i] = i;
        int c = 0;
        
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            int ru = find(u), rv = find(v);
            if (ru != rv) {
                parent[ru] = rv;
                parity[ru] = parity[u] ^ parity[v]  ^  w;
                c++;
            }
            else {
                if ((parity[u] ^ parity[v]) == w)    c++;
            }
        }
        return c;
    }
    public int find(int x) {
        if(parent[x] != x){
            int p = parent[x];
            parent[x] = find(p);
            parity[x] ^= parity[p]; 
        }
        return parent[x];
    }
}