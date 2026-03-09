class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> hm=new HashMap<>();
        for(int[] seat:reservedSeats){
            if(!hm.containsKey(seat[0])){
                hm.put(seat[0],new HashSet<>());
            }
            hm.get(seat[0]).add(seat[1]);
        }
        int c=(n-hm.size())*2;
        for(Set<Integer> seats:hm.values()){
            boolean left=!(seats.contains(2) || seats.contains(3) || seats.contains(4) || seats.contains(5));
            boolean mid=!(seats.contains(4) || seats.contains(5) || seats.contains(6) || seats.contains(7));
            boolean right=!(seats.contains(6) || seats.contains(7) || seats.contains(8) || seats.contains(9)); 
            if(left && right)   c+=2;//left,right are true
            else if(left || mid || right)   c++;//any 1
        }
        return c;
    }
}