class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        for (int i : nums)
            freq[i]++;
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (freq[i] == 1) {
                ans += i;
            }
        }
        return ans;
    }
}