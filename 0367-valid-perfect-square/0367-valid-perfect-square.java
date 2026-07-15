class Solution {
    public boolean isPerfectSquare(int num) {

        for(long i=1; i <= num; i++){
            long square = i * i;

            if(square == num){
                return true;
            }
        }
        return false;
    }
}