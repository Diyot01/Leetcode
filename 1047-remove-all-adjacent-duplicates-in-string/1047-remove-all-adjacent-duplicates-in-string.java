class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else{
                char top = st.peek();
                if(ch!=top) st.push(ch);
                else st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.size(); i++) {
            char ch = st.get(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}