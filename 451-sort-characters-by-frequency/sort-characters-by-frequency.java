class Solution {
    public String frequencySort(String s) {
        // Map<Character, Integer> count = new HashMap<>();

        // for(char c : s.toCharArray()){
        //     if(count.containsKey(c)){
        //         count.put(c, count.get(c) + 1);
        //     }else{
        //         count.put(c, 1);
        //     }
        // }

        // List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(count.entrySet());

        // Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {
        //     @Override
        //     public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        //         return o2.getValue().compareTo(o1.getValue()); 
        //     }
        // });

        // String result = "";
        // for (Map.Entry<Character, Integer> entry : entryList) {
        //     int i=1;
        //     while(i <= entry.getValue()){
        //         result += String.valueOf(entry.getKey());
        //         i++;
        //     }
        // }

        // return result;

        Map<Character,Integer> freq=new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> pq=new PriorityQueue<>(
            (a,b)-> freq.get(b)-freq.get(a)
        );
        pq.addAll(freq.keySet());
        
        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=freq.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }
        }
        return sb.toString();

    }
}