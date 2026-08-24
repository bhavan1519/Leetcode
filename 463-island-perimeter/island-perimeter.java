class Solution {
    int ans=0;
    public int islandPerimeter(int[][] grid) {
        int[][] way = {{1, 0},{-1, 0},{0, 1},{0, -1}};
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visit=new boolean[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(!visit[i][j] && grid[i][j]==1){
                    dfs(grid,i,j,way,visit);
                    return ans;
                }
            }
        }
        return 0;
    }
    private void dfs(int[][] grid, int i, int j , int[][] way, boolean[][] visit){
        visit[i][j]=true;
        for(int[] a:way){
            int i1= a[0]+i;
            int j1=a[1]+j;
            if (i1 < 0 || i1 >= grid.length || j1 < 0 || j1 >= grid[0].length) ans++;
            else if(grid[i1][j1]==0) ans++;
            else if(!visit[i1][j1] && grid[i1][j1]==1){
                dfs(grid,i1,j1,way,visit);
            }
        }
    }
}