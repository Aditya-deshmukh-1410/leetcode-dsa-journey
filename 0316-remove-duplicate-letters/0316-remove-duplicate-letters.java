class Solution {
    public String removeDuplicateLetters(String s) {

        int[] lastIndex = new int[26];
        boolean[] isVisited = new boolean[26];

        for(int i= 0 ;i<s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(isVisited[ch - 'a']){
                continue;
            }

            while(!stack.isEmpty()
                  && stack.charAt(stack.length()-1) > ch
                  && lastIndex[stack.charAt(stack.length()-1) - 'a'] > i){

                    isVisited[stack.charAt(stack.length() - 1) - 'a'] = false;
                    stack.deleteCharAt(stack.length()-1);

                  }

                  stack.append(ch);
                  isVisited[ch-'a'] = true;
        }
        return stack.toString();
    }
}