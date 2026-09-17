import java.util.Arrays;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n];
        int INF = Integer.MAX_VALUE / 2;
        Arrays.fill(minLen, INF);
        int left = 0, currentSum = 0;
        int ans = INF;
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == target) {
                int currLen = right - left + 1;
                if (left > 0 && minLen[left - 1] != INF) {
                    ans = Math.min(ans, currLen + minLen[left - 1]);
                }
                if (right > 0) {
                    minLen[right] = Math.min(minLen[right - 1], currLen);
                } else {
                    minLen[right] = currLen;
                }
            } else {
                if (right > 0) {
                    minLen[right] = minLen[right - 1];
                }
            }
        }
        return ans >= INF ? -1 : ans;
    }
}