class Solution {
    public void rotate(int[][] matrix) {
       for(int i =0;i<matrix.length;i++)
       {
            for(int j = i+1;j<matrix.length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
       } 
       for(int x = 0;x<matrix.length;x++)
       {
            for(int y =0;y<matrix.length/2;y++)
            {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[x][matrix.length - 1 - y];
                matrix[x][matrix.length - 1 - y] = temp;
            }
       }
    }//Find transpose and reverse each row
}
