class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> map = new ArrayList<>();
        int res = 0;
        double size = Math.pow(2, n);
        for(int i = 0; i < size; i++){
            res = i^(i>>1);
            map.add(res);
        }
        return map;
    }
}