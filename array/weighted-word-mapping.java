class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            long sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            long index = sum % 26;
            if (index < 0) {
                index += 26;
            }
            sb.append((char) ('z' - index));
        }
        return sb.toString();
    }
}