class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIdx = search(matrix,target);
        if(rowIdx != -1)
            return binarySearch(rowIdx,matrix,target);
        else{
            return false;
        }
    }

    public int search(int[][] matrix, int target)
    {
        int low = 0;
        int high = matrix.length - 1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length-1] >= target)
                return mid;
            else if(target < matrix[mid][0]){
                high = mid - 1;
            }else if(target > matrix[mid][0]){
                low = mid + 1;
            }
        }
        return -1;
    }
    public boolean binarySearch(int idx,int matrix[][],int target)
    {
        int low = 0;
        int high = matrix[idx].length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(matrix[idx][mid] == target)
                return true;
            else if(matrix[idx][mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
