class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        for(int num : nums1){
             map1.add(num);
        }

         for (int n : nums2){
            if(map1.contains(n)){
                map2.add(n);
            }
         }
        int[] res = new int[map2.size()];
        int index = 0;
        for (int num : map2) {
        res[index++] = num;
        }
        return res;
    }
}