class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] max = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i ==0 && j ==0) max[i][j] = grid[i][j];
                else if(i == 0) max[i][j] = grid[i][j] + max[i][j-1];
                else if(j == 0) max[i][j] = grid[i][j] + max[i-1][j];
                else max[i][j] = grid[i][j] + Math.min(max[i-1][j], max[i][j-1]);
            }
        }

        return max[m-1][n-1];
    }
}