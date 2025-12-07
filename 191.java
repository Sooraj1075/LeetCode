class Solution {
    public static int hammingWeight(int n) {
        int c = 0;
        while(n != 0)
        {
            n = n &(n-1); //AND of current and decrment of current elimate '1' each time
            c++;    
        }
        return c;
    }
}
