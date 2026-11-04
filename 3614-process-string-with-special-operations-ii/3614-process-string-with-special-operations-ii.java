class Solution {
    public char processStr(String s, long k) {

        long length = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '*') {
                length = Math.max(0, length - 1);
            }
            else if(c == '#') {
                length = length * 2;
            }
            else if(c != '%') {
                length++;
            }
        }
        if(k >= length) return '.';

        

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if(c == '*') {
                length++;
            }
            else if(c == '#') {
                length = length / 2;

                if(k >= length) {
                    k -= length;
                }
            }
            else if(c == '%') {
                k = length - 1 - k;
            }
            else {
                length--;

                if(k == length) {
                    return c;
                }
            }
        }

        return '.';
    }
}