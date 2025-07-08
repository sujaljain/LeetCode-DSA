class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] result = new int[n + 1][2];
        int resIdx = 0;
        int i = 0;

        // Left Part
        while (i < n && intervals[i][1] < newInterval[0]) {
            result[resIdx++] = intervals[i++];
        }

        // Merge Overlapping Intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result[resIdx++] = newInterval;

        // Right Part
        while (i < n) {
            result[resIdx++] = intervals[i++];
        }

        return Arrays.copyOfRange(result, 0, resIdx);
    }
}
