class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int len = piles.length;

        if(len == h) return piles[len-1];
        
        int low = 1;
        int high = piles[len-1];
        int result = -1;

        while(low <= high){
            int mid = (low+high)/2;
            long time = 0;

            for(int i = 0;i < len; i++){
                if(piles[i]%mid == 0) time +=piles[i]/mid;
                else time += (piles[i]/mid) + 1;
            }

            if(time > h) low = mid+1;
            else {
                result = mid;
                high = mid-1;
            }
        }

        return result;
    }
}