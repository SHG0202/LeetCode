class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        //Transpose
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(i != j) {
                    //swap elements diagonally
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        //Reverse each row

        for(int i=0;i<len;i++){
            int start = 0;
            int end = len - 1;

            while (start < end) {
                // Swap elements at start and end pointers
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                // Move pointers towards the center
                start++;
                end--;
            }
        }

    }
}