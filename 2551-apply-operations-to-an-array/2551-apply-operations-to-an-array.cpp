class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        int pos = 0;
        for(int i=0 ;i<nums.size()-1 ;i++){
            if(nums[i]==nums[i+1] ){
                nums[i]= nums[i]*2;
                nums[i+1]=0;
            }
        }
        for(int i=0 ;i<nums.size() ;i++){
            if(nums[i]!=0){
                nums[pos++] = nums[i];
            }
        }
        while(pos < nums.size()){
        nums[pos++] = 0;
        }     
        return nums;
    }
};