class Solution {
    public boolean isValid(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        while(i < sb.length()-1){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);

            if((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')){
                sb.delete(i,i+2);

                if(i>0) i--;
            }else{
                i++;
            }
        }
        return sb.length() == 0;
    }
}