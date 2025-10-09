class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Missing_Number = 0;
        int Actual_Sum  = n * (n + 1) / 2;
        int Excepeted_Sum = 0;
        for (int i = 0; i < n; i++) {
            Excepeted_Sum += nums[i];
            Missing_Number = Actual_Sum - Excepeted_Sum;

        }

        return Missing_Number;

    }

}