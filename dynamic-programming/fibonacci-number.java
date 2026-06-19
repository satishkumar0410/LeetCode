class Solution {
    public int fib(int n) {
        int [] memo = new int [100];
        Arrays.fill(memo,-1);
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        if(memo[n] != -1) return memo[n];
        memo[n] = fib(n-2)+ fib(n-1);
        return memo[n];
    }
}