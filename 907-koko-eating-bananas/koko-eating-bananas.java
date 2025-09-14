class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);
        int len = piles.length;
        int max = 0;

        for(int i=0;i<len;i++){
            max = Math.max(max, piles[i]);
        }

        if(len == h) return max;
        
        int low = 1;
        int high = max;

        while(low <= high){
            int mid = (low+high)/2;
            long time = 0;

            for(int i = 0;i < len; i++){
                if(piles[i]%mid == 0) time +=piles[i]/mid;
                else time += (piles[i]/mid) + 1;
            }

            if(time > h) low = mid+1;
            else high = mid-1;
        }

        return low;
    }
}