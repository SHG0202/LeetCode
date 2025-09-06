class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;

        while(startCol <= endCol && startRow <= endRow){
            for(int j=startCol;j<=endCol;j++){
                arr.add(matrix[startRow][j]);
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                arr.add(matrix[i][endCol]);
            }
            endCol--;
            if(startRow <= endRow){
                for(int j=endCol;j>=startCol;j--){
                    arr.add(matrix[endRow][j]);
                }
                endRow--;
            }
            if(startCol <= endCol ){
                for(int i=endRow;i>=startRow;i--){
                    arr.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }

        return arr;
    }
}