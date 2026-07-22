class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        for(int i = 0; i< nums1.length ; i++){
            set1.add(nums1[i]);
        }

        Set<Integer> resultSet = new HashSet<>();

        for(int i = 0; i< nums2.length ; i++){
            if(set1.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }
        int ans[] = new int[resultSet.size()];

        int index = 0;

        for(int num : resultSet){
            ans[index] = num;
            index++;
        }
        return ans;
    }
}