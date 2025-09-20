class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high) / 2;
            int row = getMax(mat, mid);
            int left = mid-1 >= 0 ? mat[row][mid-1] : -1;
            int right = mid+1 <= n-1 ? mat[row][mid+1] : -1;

            if(mat[row][mid] > left && mat[row][mid] > right) return new int[] {row, mid};
            else if(mat[row][mid] > left && mat[row][mid] < right) low = mid+1;
            else high = mid-1;
        }

        return new int[] {-1, -1};
    }

    public int getMax(int[][] mat, int mid) {
        int lrow = mat.length;
        int res = -1;
        int index = -1;

        for(int i=0;i<lrow;i++){
            if(res < mat[i][mid]){
                res = mat[i][mid];
                index = i;
            }
        }

        return index;
    }
}