class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int maxPeak = arr[0];
        int maxPeakIdx = 0;

        for (int i = 1; i < n - 1; i++) {
            // if (i == 0 && arr[0] > arr[1])
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int peak = arr[i];
                if (peak > maxPeak) {
                    maxPeak = peak;
                    maxPeakIdx = i;
                }
            }
            if (i == n - 2 && arr[i] < arr[i + 1]) {
                int peak = arr[i+1];
                if (peak > maxPeak) {
                    maxPeak = peak;
                    maxPeakIdx = i;
                }
            }
        }

        return maxPeakIdx;
    }
}