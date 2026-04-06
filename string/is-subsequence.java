class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0,j=0;
    int sai = t.length();
    int ram = s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();
    if(ram<1) return true;
    while(i<sai){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
    if(j==ram)return true;
    }
    return false;
    }
}