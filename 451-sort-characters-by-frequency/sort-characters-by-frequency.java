class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()){
            if(count.containsKey(c)){
                count.put(c, count.get(c) + 1);
            }else{
                count.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(count.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); 
            }
        });

        //LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        String result = "";
        for (Map.Entry<Character, Integer> entry : entryList) {
            //sortedMap.put(entry.getKey(), entry.getValue());
            int i=1;
            while(i <= entry.getValue()){
                result += String.valueOf(entry.getKey());
                i++;
            }
        }

        return result;
    }
}