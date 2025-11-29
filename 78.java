class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0,nums,new ArrayList<>(),result);
        return result;
    }

    public void helper(int i,int nums[],List<Integer> curr,List<List<Integer>> result)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(curr));
            return;
        }

        helper(i+1,nums,curr,result);
        curr.add(nums[i]);
        helper(i+1,nums,curr,result);

        curr.remove(curr.size() -1);



    }
}
