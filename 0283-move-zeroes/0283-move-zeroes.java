class Solution {
    public void swap(int [] num ,int i , int j){
        int temp = num[i] ;
        num[i] = num[j];
        num[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0 ; right < nums.length ;right++){
            if(nums[right]!= 0){
                swap(nums,left,right);
                left++;
            }
        }
    }
}