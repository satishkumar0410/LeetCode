class Solution {
    public String decodeString(String s) {
        Deque<Character> laudesh = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            laudesh.add(c);    
        }
        return pukpulihora(laudesh);
    }
    public String pukpulihora(Deque<Character> laudesh) {
        StringBuilder sb = new StringBuilder();
        int sankya = 0;
        while(!laudesh.isEmpty()) {
            char c = laudesh.poll();
            if(Character.isDigit(c)) {
                sankya = sankya*10 + (c - '0');
            }
            else if (c == '['){
                String pukesh = pukpulihora(laudesh);
                for(int i = 0; i < sankya; i++) {
                    sb.append(pukesh);
                }
                sankya = 0;
            }
            else if(c == ']') {
                break;
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}