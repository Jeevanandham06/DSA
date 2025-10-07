class Solution {
    private void reverse (int [] nums , int start , int end){
        //swap condtion for reversing the array
        int n =nums.length;

        while(start<end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start ++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        // reverse helper function
        int n =nums.length;
        k =k%n;//handle larger  k elements 
         //heleper function(array name , start index , end index)
        reverse ( nums , 0 ,n-1); // first reverse;
        reverse ( nums , 0 , k -1); //second reverse;
        reverse ( nums , k , n-1);
        
    }
}