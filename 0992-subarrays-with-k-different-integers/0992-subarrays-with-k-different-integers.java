class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }

    private int atMost(int[] nums, int k){

        int i = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int j = 0;j<nums.length;j++){

            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(map.size() > k){
                map.put(nums[i],map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0){
                    map.remove(nums[i]);
                }
                i++;
            }
            count += j-i+1;
        }
        return count;
    }
}
