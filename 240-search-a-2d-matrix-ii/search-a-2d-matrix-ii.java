class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lrow = matrix.length;
        int lcol = matrix[0].length;

        for(int i = 0;i<lrow;i++){
            int low = 0;
            int high = lcol-1;

            while(low <= high) {
                int mid = (low + high) / 2;

                if(matrix[i][mid] == target) return true;
                else if(matrix[i][mid] < target) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }
}