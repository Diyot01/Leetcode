public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; // Handle 0 and 1 directly
        }

        int left = 2, right = x / 2; // Start binary search from 2 to x/2
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            long midSquared = (long) mid * mid; // Use long to prevent overflow

            if (midSquared == x) {
                return mid; // Found exact square root
            } else if (midSquared < x) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return right; // The right pointer will be at the largest integer whose square is <= x
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        System.out.println(solution.mySqrt(4));  // Output: 2
        System.out.println(solution.mySqrt(8));  // Output: 2
        System.out.println(solution.mySqrt(16)); // Output: 4
        System.out.println(solution.mySqrt(0));  // Output: 0
        System.out.println(solution.mySqrt(1));  // Output: 1
        System.out.println(solution.mySqrt(15)); // Output: 3
    }
}