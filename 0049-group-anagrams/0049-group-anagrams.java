class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp = new HashMap<>();
        for (int i = 0;i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (hp.containsKey(s))   hp.get(s).add(strs[i]);
            else{
                hp.put(s, new ArrayList<>());
                hp.get(s).add(strs[i]);
            }
        }
        return new ArrayList<>(hp.values()); 
    }
}