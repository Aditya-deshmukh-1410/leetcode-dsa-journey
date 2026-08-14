class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int res[] = new int[n];

        for(int i = 0 ; i<n; i++){

            Stack<Integer> stack = new Stack<>();

            int j = 0;
            while(nums2[j] != nums1[i]){
                j++;
            }

            for(int k = j+1; k<nums2.length; k++){

                while(!stack.isEmpty() && stack.peek() <= nums2[k]){
                    stack.pop();
                }

                if(nums2[k] > nums1[i]){
                    res[i] = nums2[k];
                    break;
                }

                stack.push(nums2[k]);

            }

            if(res[i] == 0){
                res[i] = -1;
            }
        }
        return res;
        
    }
}