class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min_price = Integer.MAX_VALUE;
        

        for(int i:prices)
        {
            min_price = Math.min(min_price,i);
            max = Math.max(max,i - min_price);
        }

        return max;
    }
}
