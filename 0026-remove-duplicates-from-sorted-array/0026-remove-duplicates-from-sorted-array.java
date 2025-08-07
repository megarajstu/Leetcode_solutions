class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        int pos = 0;
        for(int i=0 ; i<nums.length ;i++){
            tree.add(nums[i]);
        }
        for(int n : tree){
            nums[pos++] = n;
        }

        return tree.size();
    }
}