import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return the result
            }
            // Set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }

        // If we reach here, it means we had a carry for all digits
        // We need to create a new array with an additional digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // Set the first digit to 1
        return newNumber; // The rest will be 0s by default
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(solution.plusOne(digits1))); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution.plusOne(digits2))); // Output: [4, 3, 2, 2]

        int[] digits3 = {9, 9, 9};
        System.out.println(Arrays.toString(solution.plusOne(digits3))); // Output: [1, 0, 0, 0]
    }
}