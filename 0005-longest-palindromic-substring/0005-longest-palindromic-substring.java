class Solution {

    private boolean isPalin(String str, int left , int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {

        int n = s.length();
        String result = "";

        for(int i = 0; i<n ; i++){
            for(int j =i; j<n; j++){
                if(isPalin(s,i,j)){
                    if((j-i+1) > result.length()){
                        result = s.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }
}