class Solution {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int[nums.length];
        //first find prefix muliplication 
        //eg:- prefix of 3 is 2(2*1)
        output[0] = 1;
        for(int i = 1;i<nums.length;i++)
        {
            output[i] = output[i-1]* nums[i-1];
        }
        //post fix starting from last element
        int postfix = 1;
        for(int j = nums.length - 1;j>=0;j--)
        {
            output[j] = postfix * output[j];
            postfix *= nums[j];
        }
        //here ouput array is not calculated as extra space
        return output;
    }
}
