class Solution {
    int [] memo = new int[100];
    public int fib(int n) {
        Arrays.fill(memo,-1);
        return solve(n);
    }
    private int solve(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(memo[n] != -1) return memo[n];
        memo[n] = solve(n-1)+solve(n-2);
        return memo[n];
    }
}