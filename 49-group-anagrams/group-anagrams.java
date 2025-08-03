class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[strs.length];
        List<List<String>> result = new ArrayList<>();

        System.arraycopy(strs, 0, sortedStrs, 0, strs.length);
        
        for(int i=0;i<strs.length;i++){
            char[] charArray = sortedStrs[i].toCharArray();
            Arrays.sort(charArray);
            sortedStrs[i] = String.valueOf(charArray);
        }

        for(int i=0;i<strs.length;i++){
            List<String> row = new ArrayList<>();
            if(strs[i].equals(" ")){
                continue;
            }
            for(int j=i;j<strs.length;j++){
                if(sortedStrs[i].equals(sortedStrs[j]) && !strs[j].equals(" ")){
                    row.add(strs[j]);
                    strs[j] = " ";
                }
            }
            result.add(row);
        }

        return result;
    }
}