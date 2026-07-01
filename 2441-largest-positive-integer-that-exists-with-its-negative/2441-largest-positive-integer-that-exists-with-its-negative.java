class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            for(int j=0;j<nums.length;j++){
                if(nums[j]+nums[i]==0) return nums[i];
            }
        }
        return -1;
    }
}