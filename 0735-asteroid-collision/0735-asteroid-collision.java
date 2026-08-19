class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for(int a : asteroids){

            while(!st.isEmpty() && a<0 && st.peek()>0){

                if(st.peek() < -a){
                    st.pop();
                }else if(st.peek() == -a){
                    st.pop();
                    a = 0;
                    break;
                }else{
                    a = 0;
                    break;
                }

            }
            if(a!=0) st.push(a);
        }

            int ans[] = new int[st.size()];
            for(int j = st.size()-1; j>=0 ; j--){
                ans[j] = st.pop();
            }

            return ans;
    }
}