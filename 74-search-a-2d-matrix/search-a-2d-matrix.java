class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int left = 0;
        int right = r * c - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int row = mid / c;
            int col = mid % c;
            int finded = matrix[row][col];

            if (finded == target) {
                return true;
            } else if (finded < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}