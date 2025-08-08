class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = 0 ,actual_sum = n * (n+1) /2 ;
        for(int i=0 ; i<nums.length ;i++){
            expected_sum +=nums[i];
        }
        return actual_sum-expected_sum  ;
    }
}