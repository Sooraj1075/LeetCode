class Solution {
    public int numIslands(char[][] grid) {
       int m = grid.length;
       int n = grid[0].length;
       int islands = 0;
       for(int i = 0;i<m;i++)
       {
        for(int j = 0;j<n;j++)
        {
            if(grid[i][j] == '1')
                islands++;
                dfs(i,j,m,n,grid);
        }
       } 
       return islands;
    }
    public void dfs(int i,int j,int m,int n,char[][] g)
    {
        if(i<0 || i>=m || j<0 || j>=n || g[i][j] != '1')
            return;
        else{
            g[i][j] = '0';
            dfs(i,j+1,m,n,g);//toward right
            dfs(i+1,j,m,n,g);//towards down
            dfs(i,j-1,m,n,g);//towards left
            dfs(i-1,j,m,n,g);//towards up
        }
    }
}
