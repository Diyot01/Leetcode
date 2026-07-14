import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int m=1;
        for(int num:nums){
            if(num==m){
                m++;
            }
            else if(num>m){
                return m;
            }
        }
        return m;
    }
}