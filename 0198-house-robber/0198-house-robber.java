class Solution {
    public int rob(int[] nums) {
        int m = 0;
        if (nums.length < 3 && nums.length > 0) {
            if (nums.length == 1) {
                m = nums[0];
            } else if (nums[0] > nums[1]) {
                m = nums[0];
            } else {
                m = nums[1];
            }
        } else if (nums.length >= 3) {
            int p1 = 0;
            int p2 = 0;

            for (int i = 0; i < nums.length; i++) {
                int temp = p1;
                p1 = Math.max(p1, p2 + nums[i]);
                p2 = temp;
            }
            m = p1;
        }

        return m;
    }
}