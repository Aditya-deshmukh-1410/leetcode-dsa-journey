class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int[] result = null; // best

        int start = Math.max(0,k-nums2.length);
        int end = Math.min(k, nums1.length);

        for(int i = start; i <=end; i++){
            int[] sub1 = maxSubSeq(nums1,i);
            int[] sub2 = maxSubSeq(nums2,k-i);

            int[] current = merge(sub1,sub2,k);

            if(result == null || greater(current,0,result,0)){
                result = current;
            }

        }
        return result;
    }


    public int[] maxSubSeq(int[] nums,int k){
        Stack<Integer> stack = new Stack<>();

        int remove = nums.length - k;

        for(int num: nums){

            while(!stack.isEmpty() && remove > 0 && stack.peek() < num){
                stack.pop();
                remove--;
            }

            stack.push(num);

        }

        while(remove > 0){
            stack.pop();
            remove--;
        }


        int[] res = new int[k];

        for(int i = 0; i< k; i++){
            res[i] = stack.get(i);
        }
        return res;
    }

    public int[] merge(int[] nums1 ,int[] nums2, int k){
        int[] result = new int[k];

        int i = 0, j = 0, r = 0;
        while(i < nums1.length || j < nums2.length){

            if(greater(nums1,i,nums2,j)){
                result[r++] = nums1[i++];
            }else{
                result[r++] = nums2[j++];
            }
        }
        return result;
    }


    public boolean greater(int[] nums1, int i, int[] nums2, int j){
        
        while(i < nums1.length && j < nums2.length && nums1[i] == nums2[j]){
            i++;
            j++;
        }

        if(j == nums2.length){
            return true;
        }

        if(i < nums1.length && nums1[i] > nums2[j]) {
            return true;
        }

        return false;
    }
}