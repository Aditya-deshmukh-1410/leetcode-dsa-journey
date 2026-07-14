class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int n = nums.length;

        int totalSum = 0;

        int currMax = 0;
        int maxSum = Integer.MIN_VALUE;

        int currMin = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i< n; i++){
            totalSum += nums[i];

            currMax = Math.max(nums[i],currMax + nums[i]);
            maxSum = Math.max(currMax , maxSum);

            currMin = Math.min(nums[i],currMin + nums[i]);
            minSum = Math.min(currMin , minSum);
        }

        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum , totalSum - minSum);
    }
}