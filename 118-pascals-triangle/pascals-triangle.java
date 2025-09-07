class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        // Normal Method

        // for(int i=1;i<=numRows;i++){
        //     List<Integer> row = new ArrayList<>();
        //     for(int j=1;j<=i;j++){
        //         if(j==1) row.add(1);
        //         else if(j==i) row.add(1);
        //         else{
        //             row.add(result.get(i-2).get(j-2) + result.get(i-2).get(j-1));
        //         }    
        //     }
        //     result.add(row);
        // }

        // NcR Method
        for (int row = 0; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();
            long val = 1;

            for (int col = 0; col <= row; col++) {
                newRow.add((int) val);
                val = val * (row - col) / (col + 1); // nCr formula
            }

            result.add(newRow);
        }

        return result;
    }
}