class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;

        if((long)m*k > (long)len) return -1;

        int max = -1;
        int low = 1;
        int high = -1;

        for(int b : bloomDay){
            max = Math.max(max, b);
        }

        high = max;

        while(low <= high){
            int mid = (low+high)/2;

            if(isPossible(bloomDay, m, k, mid)) high = mid-1;
            else low = mid+1;
        }

        return low;
    }

    public boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int len = bloomDay.length;
        int tempCount = 0;
        int finalCount = 0;

        for(int i=0;i<len;i++){
            if(bloomDay[i] <= mid) tempCount++;
            else{
                finalCount += tempCount / k;
                tempCount = 0;
            }
            
            if(finalCount >= m) return true;
        }
        finalCount += tempCount / k;

        if(finalCount >= m) return true;
        return false;
    }
}