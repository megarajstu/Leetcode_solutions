class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag ;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch=='{' || ch =='[')
            st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char t = st.pop();
                if(ch=='}' && t != '{' ||  ch==']' && t != '[' || ch==')' && t !='(') return false; 
            }
        } 
        return st.isEmpty();
    }
}