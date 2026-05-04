class Solution {
    public int minFlips(int a, int b, int c) {
        int cbitone = (c & ~(a|b));
        int abitone = (a& ~c);
        int bbitone = (b& ~c);
        return Integer.bitCount(cbitone) + Integer.bitCount(abitone) + Integer.bitCount(bbitone);
    }
}