class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int cur = nums.length - 1;

        while (left <= right) {
            int l_sqrt = nums[left] * nums[left];
            int r_sqrt = nums[right] * nums[right];

            if (l_sqrt > r_sqrt) {
                res[cur] = l_sqrt;
                left++;
            } else {
                res[cur] = r_sqrt;
                right--;
            }
            cur--;
        }

        return res;
    }
}
