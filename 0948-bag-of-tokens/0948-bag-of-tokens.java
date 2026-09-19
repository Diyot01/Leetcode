class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        int i=0;
        int j=n-1;
        int c=0;
        int max=0;
        Arrays.sort(tokens);
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                c++;
                max=Math.max(c,max);
                i++;
            }else if(c>0){
                power+=tokens[j];
                c--;
                j--;
            }else{
                break;
            }
        }
        return max;
    }
}