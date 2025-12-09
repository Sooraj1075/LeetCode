class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while(s <e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] < arr[mid+1])
            {
                s = mid+1;
            }
            else
            {
                e = mid - 1;
            }
        }

        return s;// use binary search for mid element first,elemnts first increase and then decreses
    }
}
