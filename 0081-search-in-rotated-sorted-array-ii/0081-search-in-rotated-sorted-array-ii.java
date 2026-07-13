class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (r >= l) {  
            int m = (l + r) / 2;
            if (nums[m] == target)
                return true;
            if (nums[m] == nums[l] && nums[m] == nums[r]) {
                r -= 1;     
                l += 1;
                continue;
            }
            if (nums[l] > nums[m]) {
                if (target >= nums[m] && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
            else {
                if (target >= nums[l] && target <= nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return false;
    }
}