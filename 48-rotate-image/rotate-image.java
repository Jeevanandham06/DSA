class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverserow(matrix[i]);
        }
    }

    private void reverserow(int[] row) {
        int n = row.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int swap = row[left];
            row[left] = row[right];
            row[right] = swap;
            left++;
            right--;
        }
    }

}