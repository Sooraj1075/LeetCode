class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            if(!h.containsKey(i)){
                h.put(i,1);
            }
            else{
                h.put(i,h.get(i)+1);
            }
        }
        for (Integer value : h.values()) {
                 if(value > 2){
                    return false;
                 }
        }
        return true;
    }
}
