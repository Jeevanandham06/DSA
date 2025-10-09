class Solution {
    public int missingNumber(int[] nums) {
       /* int n = nums.length;
        int Missing_Number = 0;
        int Actual_Sum  = n * (n + 1) / 2;
        int Excepeted_Sum = 0;
        for (int i = 0; i < n; i++) {
            Excepeted_Sum += nums[i];
            Missing_Number = Actual_Sum - Excepeted_Sum;

        }

        return Missing_Number;*/
        int n =nums.length;
        int XOR1=0  , XOR2=0;
      
        for(int i =0 ;i<n;i++){
            XOR1=XOR1^(i+1);
            XOR2=XOR2^nums[i];
        }
        return (XOR1^XOR2);

    }

}

    