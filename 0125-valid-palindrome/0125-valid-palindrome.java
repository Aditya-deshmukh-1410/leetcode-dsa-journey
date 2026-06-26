class Solution {

    private boolean isAlphaNumeric(char c){
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'|| c >= '0' && c <= '9' );
    }

    public boolean isPalindrome(String str) {
        
        int i = 0, j = str.length()-1;

        while(i<j){
             char l = str.charAt(i);
             char r = str.charAt(j);

            if(!isAlphaNumeric(l)){
                i++;
            }else if(!isAlphaNumeric(r)){
                j--;
            }else{
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                i++; // match condn
                j--; // match condn
            }

        }
       return true;
    }
}