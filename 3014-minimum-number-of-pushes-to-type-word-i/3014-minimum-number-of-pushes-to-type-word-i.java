class Solution {
    public int minimumPushes(String word) {

        int pushBtn = 0;
        
        for(int i = 0; i<word.length(); i++){
            pushBtn += (i/8)+1;
        }
        return pushBtn;
    }
}