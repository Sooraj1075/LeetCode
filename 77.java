class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> r = new ArrayList<>();
        comb(1,n,k,new ArrayList<>(),r);
        return r;
    }

    public void comb(int i,int n,int k ,List<Integer> curr,List<List<Integer>> r)
    {
        if(curr.size() == k)
        {
            r.add(new ArrayList<>(curr));
            return;
        }

        if(i>n)
        {
            return;
        }

        curr.add(i);

        comb(i+1,n,k,curr,r);

        curr.remove(curr.size() - 1);

        comb(i+1,n,k,curr,r);

    }
}
