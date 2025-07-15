class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;

        while (left <= right){
            int mid = (left + right)/2;
            int element = matrix[mid/col][mid%col];

            if (element < target)   left = mid+1;
            else if (element > target)  right = mid-1;
            else if (element == target) return true;
        }

        return false;
    }
}