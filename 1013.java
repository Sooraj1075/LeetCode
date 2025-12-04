class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;

        if (sum % 3 != 0)
            return false;

        int target = sum / 3;
        int sum1 = 0;
        int parts = 0;

        for(int j = 0;j<arr.length;j++)
        {
            sum1 += arr[j];

            if(sum1 == target)
            {
                parts++;
                sum1 = 0;
                if(parts == 2 && j <arr.length-1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
