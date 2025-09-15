class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int len = weights.length;
        int low = 1;
        int high = 0;

        for(int w : weights){
            high += w;
        }

        while(low <= high){
            int mid = (low+high)/2;

            if(isPossible(weights, days, mid)) high = mid-1;
            else low = mid+1;
        }

        return low;
    }

    public boolean isPossible(int[] weights, int days, int mid){
        int tempSum = 0;
        int tempDays = 0;

        for(int w : weights){
            if(w > mid) return false;
            tempSum += w;
            if(tempSum == mid) {
                tempDays++;
                tempSum = 0;
            }else if(tempSum > mid){
                tempDays++;
                tempSum = w;
            }
        }
        
        if(tempSum > 0) tempDays++;

        if(tempDays <= days) return true;
        return false;
    }
}