class Solution {
    public int trap(int[] height) {

        int len = height.length;
        int count = 0;

        // Brute Force

        // for (int i=0;i<len;i++){
        //     int lmax = 0;
        //     int rmax = 0;
        //     for(int j=i;j>=0;j--){
        //         if(height[j] > lmax) lmax = height[j];
        //     }
        //     for(int k=i;k<len;k++){
        //         if(height[k] > rmax) rmax = height[k];
        //     }

        //     count += Math.min(lmax, rmax) - height[i];
        // }

        // return count;


        //Method - 2

        // int[] htsPre = new int[len];
        // int[] htsSuf = new int[len];

        // htsPre[0] = height[0];
        // htsSuf[len-1] = height[len-1];

        // for(int j=1;j<len;j++){
        //     if(height[j] > htsPre[j-1]) htsPre[j] = height[j];
        //     else htsPre[j] = htsPre[j-1];
        // }

        // for(int j=len-2;j>=0;j--){
        //     if(height[j] > htsSuf[j+1]) htsSuf[j] = height[j];
        //     else htsSuf[j] = htsSuf[j+1];
        // }

        // for(int i=0;i<len;i++){
        //     int curr = Math.min(htsPre[i], htsSuf[i]);
        //     if(curr > height[i]) count += curr - height[i]; 
        // }

        // return count;

        int left = 0;
        int right = len-1;
        int lmax = 0; int rmax = 0;

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] >= lmax){
                    lmax = height[left];
                }else{
                    count += (lmax - height[left]);
                }
                left++;
            }else{
                if(height[right] >= rmax){
                    rmax = height[right];
                }else{
                    count += (rmax - height[right]);
                }
                right--;
            }
        }

        return count;
    }
}