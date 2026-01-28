class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int res = 0;
        for(int num : nums){
            if(!map.contains(num)){
            map.add(num);
        }
        else {
            res = num;
        }
        }
        return res;
    }
}