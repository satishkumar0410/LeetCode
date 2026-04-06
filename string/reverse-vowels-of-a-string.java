class Solution {
    public String reverseVowels(String s) {
        char [] dharanbromyhero = s.toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int my = 0;
        int herodharan = dharanbromyhero.length-1;
        while(my < herodharan){
            if(set.contains(dharanbromyhero[my])){
                while(herodharan>=my){
                    if(set.contains(dharanbromyhero[herodharan])){
                        char temp = dharanbromyhero[my];
                        dharanbromyhero[my] = dharanbromyhero[herodharan];
                        dharanbromyhero[herodharan] = temp;
                        herodharan--;
                        break;
                    }
                    herodharan--;
                }
            }
            my++;
        }
        return new String(dharanbromyhero);
    }
}