class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int n = nums.length;

        int currPsum = 0;
        int maxPsum = Integer.MIN_VALUE;

        int currNsum = 0;
        int minNsum = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            currPsum += nums[i];
            maxPsum = Math.max(maxPsum,currPsum);

            if(currPsum < 0){
                currPsum = 0;
            }
        }

        for(int i = 0; i< n ; i++){
            currNsum += nums[i];
            minNsum = Math.min(minNsum,currNsum);

            if(currNsum > 0){
                currNsum = 0;
            }
        }

        return Math.max(maxPsum , Math.abs(minNsum));
        
    }
}