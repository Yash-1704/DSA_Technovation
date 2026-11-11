class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int c = 0;
        for (int n : nums) {
            if (c == 0) {
                candidate = n;
            }

            if (n == candidate) {
                c++;
            } else {
                c--;
            }
        }

        return candidate;
    }
}
