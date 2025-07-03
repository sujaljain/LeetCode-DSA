class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end - start)/2;

            if (arr[mid] < arr[mid+1]){
                // We are on the increasing part of the mountain
                start = mid+1;
            }
            else {
                // Either we are on the decreasing side or the PEAK itself!
                end = mid;
            }
        }

        return start;   // s==e
    }
}