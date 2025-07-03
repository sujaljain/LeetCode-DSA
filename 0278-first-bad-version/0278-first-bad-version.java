/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = -1;

        while (low <= high){
            int mid = low + (high-low) / 2;

            if (isBadVersion(mid)){
                ans = mid;          // This could be the first bad
                high = mid - 1;     // Therefore, searching further more
            }

            else {
                low = mid + 1;      // searching on the right
            }
        }

        return ans;
    }
}