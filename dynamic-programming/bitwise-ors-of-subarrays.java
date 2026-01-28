class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> prevResults = new HashSet<>();
        
        for (int num : arr) {
            Set<Integer> Result = new HashSet<>();
            Result.add(num);
            
            for (int prevResult : prevResults) {
                Result.add(prevResult | num);
            }
            
            unique.addAll(Result);
            prevResults = Result;
        }
        
        return unique.size();
    }
}