class Solution {
public:
    void moveZeroes(vector<int>& nums) {
      int current = 0;
      for(int i=0 ; i<nums.size();i++){
        if(nums[i] != 0){
            nums[current++] = nums[i];
        }
      }
        while(current < nums.size()){
            nums[current++] = 0;
        }
      }
};