class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n  = nums.length;
        int count = 0;
        int MaxCount = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                count++;
            }else{
               MaxCount = Math.max(count,MaxCount) ;
               count = 0;
            }
        }
        return Math.max(count,MaxCount);
    }
}