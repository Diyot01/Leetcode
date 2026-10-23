public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0; // Initialize carry

        // Loop until both strings are processed and no carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Start with the carry

            // Add the current bit of a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }

            // Add the current bit of b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            // Calculate the new bit and the carry
            result.append(sum % 2); // Append the result bit (0 or 1)
            carry = sum / 2; // Update carry (0 or 1)
        }

        // The result is built in reverse order, so reverse it
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        String a1 = "1010";
        String b1 = "1011";
        System.out.println(solution.addBinary(a1, b1)); // Output: "10101"

        String a2 = "11";
        String b2 = "1";
        System.out.println(solution.addBinary(a2, b2)); // Output: "100"

        String a3 = "0";
        String b3 = "0";
        System.out.println(solution.addBinary(a3, b3)); // Output: "0"
    }
}