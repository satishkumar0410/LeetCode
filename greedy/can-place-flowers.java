class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = flowerbed.length;
        for(int i = 1; i < x; i++){
            boolean left = i == 0 || flowerbed[i-1] == 0;
            boolean right = i == flowerbed.length-1 || flowerbed[i+1] == 0;
            if(left && right && flowerbed[i] == 0){
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <=0;
    }
}