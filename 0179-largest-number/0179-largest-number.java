class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                String first = arr[j] + arr[j + 1];
                String second = arr[j + 1] + arr[j];

                if (first.compareTo(second) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (arr[0].equals("0")) {
            return "0";
        }

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}