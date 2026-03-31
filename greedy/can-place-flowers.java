class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = flowerbed.length;
        for(int i = 0; i < x; i++){
            if(boolean atu = i == 0 || flowerbed[i-1] == 0; &&  boolean itu = i == flowerbed.length-1 || flowerbed[i+1] == 0; && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <=0;
    }
}