class Solution {
    public int maxArea(int[] n) {
        int l = 0;
        int r = n.length - 1;
        int Max_Area = 0;
        while(l<r)
        {
            int height = Math.min(n[l],n[r]);
            int width = r - l;
            Max_Area = Math.max(Max_Area,height*width);
            
            if(n[l] > n[r])
                r--;
            else
                l++;

        }
        return Max_Area;
    }
}
