class Solution {
    public boolean judgeCircle(String moves) {
        int sai = 0;
        int ram = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U') sai++;
            else if (moves.charAt(i) == 'D') sai--;
            else if (moves.charAt(i) == 'L') ram++;
            else if (moves.charAt(i) == 'R') ram--;
        }
        return (sai==0 && ram==0);
    }
}