class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int low = 0, high = numbers.length-1;
        while(high>low){
            if(numbers[low] + numbers[high] == target){
                ans[0] = low + 1;
                ans[1] = high + 1;
                return ans;
            }
            else if(numbers[low] + numbers[high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        return ans;
    }
}