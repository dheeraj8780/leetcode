class Solution {
    public int matrixSum(int[][] nums) {
        for(final int[] num : nums){
            Arrays.sort(num);
        }
        int sum = 0;
        for(int j = 0; j < nums[0].length; ++j) {
            int max = 0;
            for(int i = 0; i < nums.length; ++i)
                max = Math.max(nums[i][j], max);
            sum += max;
        }
        return sum;
    }
}