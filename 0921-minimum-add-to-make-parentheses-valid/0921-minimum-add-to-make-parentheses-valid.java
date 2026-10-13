class Solution {
    public int minAddToMakeValid(String s) {

        int opening = 0;
        int closing = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                opening++;
            }else{
                if(opening > 0){
                    opening--;
                }else{
                    closing++;
                }
            }
        }
        return opening + closing;
    }
}