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
        boolean possible = false;
        int tempCount = m;
        int tempFlower = k;

        for(int i=0;i<len;i++){
            if(!possible && bloomDay[i] <= mid) possible = true;
            if(possible){
                if(bloomDay[i] <= mid && tempFlower > 0) {
                    tempFlower--;
                    if(tempFlower == 0) {
                        tempCount--;
                        tempFlower = k;
                    }
                }
                else {
                    possible = false;
                    tempFlower = k;
                }
            }
            if(tempCount == 0) return true;
        }
        return false;
    }
}