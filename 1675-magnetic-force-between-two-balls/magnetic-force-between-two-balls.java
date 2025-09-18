class Solution {
    public int maxDistance(int[] position, int m) {
        int len = position.length;
        
        Arrays.sort(position);
        
        int low = 1;
        int high = position[len-1] - position[0];

        while(low <= high){
            int mid = (low + high) / 2;
            if(isPossible(position, m, mid)) low = mid + 1;
            else high = mid - 1;
        }

        return high;
    }

    public boolean isPossible(int[] position, int m, int mid) {
        int len = position.length;
        int lastPos = 0;
        m -= 1;

        for(int i = 1;i < len;i++){
            if(position[i] - position[lastPos] >= mid){
                lastPos = i;
                m -= 1;
            }

            if(m <= 0) return true;
        }

        return false;
    
    }
}