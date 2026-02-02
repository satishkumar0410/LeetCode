class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int l = 0;
       int e = letters.length-1;
       while(l<=e){
        int mid = l+e/2;
        if(letters[mid] <= target){
            l = mid+1;
        }
        else{
            e = mid-1;
        }
        }
        if (l == letters.length) {
         return letters[0];
        } else {
         return letters[l];
        }
        
    }
}