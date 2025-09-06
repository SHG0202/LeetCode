class Solution {
    public void setZeroes(int[][] matrix) {
        int lenR = matrix.length;
        int lenC = matrix[0].length;

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for(int i=0;i<lenR;i++){
            //if(rows.contains(i)) continue;
            for(int j=0;j<lenC;j++){
                //if(cols.contains(j)) continue;
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        } 

        for(int row : rows){
            for(int i=0;i<lenC;i++){
                matrix[row][i] = 0;
            }
        }

        for(int col : cols){
            for(int i=0;i<lenR;i++){
                matrix[i][col] = 0;
            }
        }
    }
}