class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lrow = matrix.length;
        int lcol = matrix[0].length;

        int low = 0;
        int high = lrow*lcol - 1;

        while(low <= high){
            int mid = (low+high)/2;

            int row = mid/lcol;
            int col = mid%lcol;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}