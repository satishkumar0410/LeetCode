class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> donga = new HashSet<>();
        Set<Integer> puka = new HashSet<>();
        for (int n : nums1) donga.add(n);
        for (int n : nums2) puka.add(n);
        Set<Integer> lanja = new HashSet<>(donga); //compare cheskondi inko set chesam
        Set<Integer> munda = new HashSet<>(puka);
        lanja.removeAll(puka); // common saruku ni tisi dengudi from nums2 in nums1
        munda.removeAll(donga); // common saruku ni tisi dengudi from nums1 in nums2
        return Arrays.asList(new ArrayList<>(lanja), new ArrayList<>(munda)); //returning them just as a list component 
    }
}