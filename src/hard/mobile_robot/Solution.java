package hard.mobile_robot;

import java.util.Arrays;

public class Solution {
    static final int MOD = 1000000007;
    public int sumDistance(int[] nums, String s, int d) {

        int n = nums.length;
        long [] arr = new long[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                arr[i] = (long)nums[i] - d;
            } else {
                arr[i] = (long)nums[i] + d;
            }
        }
        Arrays.sort(arr);
        long res = 0;
        for (int i = 1; i < n; i++) {
            res += 1L * (arr[i] - arr[i - 1]) * i % MOD * (n - i) % MOD;
            res %= MOD;
        }
        return (int)res;
    }
}