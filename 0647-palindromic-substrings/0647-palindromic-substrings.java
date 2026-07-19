class Solution {

    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i< s.length(); i++){
            String substr = "";
            for(int j = i; j<s.length(); j++){
                substr+= s.charAt(j);
                
                if(isPalin(substr,0,substr.length()-1)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalin(String str , int left , int right){

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}