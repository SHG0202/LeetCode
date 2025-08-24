class Solution {
    
    public int climbStairs(int n) {
        //int[] dp = new int[n+1];

        // for(int i=0;i<=n;i++){
        //     dp[i] = -1;
        // }

        //return answer(n, dp);
        int temp1 = 1;
        int temp2 = 1;

        for(int i=2;i<=n;i++){
            int curr = temp1 + temp2;
            temp2 = temp1;
            temp1 = curr;
        }

        return temp1;
    }

    public int answer(int i, int[] dp){
        if(i <= 1) return 1;

        if(dp[i] != -1) return dp[i];
        
        return dp[i] = climbStairs(i-1) + climbStairs(i-2); 
    }
}