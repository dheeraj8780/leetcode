class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxl=0;
        Stack<Integer> q=new Stack<>();
        q.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                q.push(i);
            }else{
                q.pop();
                if(q.isEmpty()){
                    q.push(i);
                }else{
                    maxl=Math.max(maxl,i-q.peek());
                }
            }
        }
        return maxl;
    }
}