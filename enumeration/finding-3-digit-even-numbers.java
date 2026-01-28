class Solution {
    public int[] findEvenNumbers(int[] digits) {
    int [] dharanheronadevudu = new int[10];
    for(int x : digits){
        dharanheronadevudu[x]++;
    }
    List<Integer> ans = new LinkedList<Integer>();
     for(int i = 1; i <= 9; i++){
       if(dharanheronadevudu[i]==0) continue;
       dharanheronadevudu[i]--;
        for(int j = 0; j<=9;j++){
           if(dharanheronadevudu[j]==0) continue;
           dharanheronadevudu[j]--;
            for(int k = 0; k <=8; k+=2){
             if(dharanheronadevudu[k]==0) continue;
                ans.add(i*100+j*10+k);
            }
             dharanheronadevudu[j]++;

        }
         dharanheronadevudu[i]++;
     }

     return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
