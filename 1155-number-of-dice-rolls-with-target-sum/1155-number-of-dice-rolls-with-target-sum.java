class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int [] [] memo = new int [n+1][target+1];  
        for(int [] row : memo)Arrays.fill(row,-1);
        return solve(n,target,k,memo)%1000000007;
    }
    public int solve(int n, int target,int k,int [] [] memo) {
        if(memo[n][target]!=-1)return memo[n][target];
        if (n == 0 && target == 0) return 1;
        if (n == 0 || target <= 0) return 0;

        int ans = 0;
        for (int i = 1; i <= k; i++) {
            if(target - i < 0) break;
            ans = (ans + solve(n - 1, target - i, k, memo)) % 1000000007;
        }
        memo [n][target]=ans;
        return memo [n][target];
    }
}