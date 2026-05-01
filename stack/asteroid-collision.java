class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> ls = new ArrayList<Integer>();
        for(int i : asteroids){
            boolean pelipoyindi = false;
            while(!ls.isEmpty() && i < 0  && ls.get(ls.size()-1) > 0){
                int peddastone = ls.get(ls.size()-1);
                if(Math.abs(i) > peddastone){
                    ls.remove(ls.size()-1);
                    continue;
                } else if (Math.abs(i) == peddastone){
                    ls.remove(ls.size()-1);
                    pelipoyindi = true;
                }
                else {
                    pelipoyindi = true;
                }
                break;
            }
            if(!pelipoyindi){
                ls.add(i);
            }
        }
        int [] res = new int[ls.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = ls.get(i);
        }
        return res;
    }
}