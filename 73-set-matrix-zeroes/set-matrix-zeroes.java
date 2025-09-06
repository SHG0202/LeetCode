class Solution {
    public void setZeroes(int[][] matrix) {
        int lenR = matrix.length;
        int lenC = matrix[0].length;

        //HashSet<Integer> rows = new HashSet<>();
        //HashSet<Integer> cols = new HashSet<>();

        int col0 = 1;
        for(int i=0;i<lenR;i++){
            //if(rows.contains(i)) continue;
            for(int j=0;j<lenC;j++){
                //if(cols.contains(j)) continue;
                if(matrix[i][j] == 0) {
                    //rows.add(i);
                    matrix[i][0] = 0;
                    //cols.add(j);
                    if(j != 0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }

        for(int i=1;i<lenR;i++){
            for(int j=1;j<lenC;j++){
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=1;j<lenC;j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i=0;i<lenR;i++){
                matrix[i][0] = 0;
            }
        }

        // for(int row : rows){
        //     for(int i=0;i<lenC;i++){
        //         matrix[row][i] = 0;
        //     }
        // }

        // for(int col : cols){
        //     for(int i=0;i<lenR;i++){
        //         matrix[i][col] = 0;
        //     }
        // }
    }
}