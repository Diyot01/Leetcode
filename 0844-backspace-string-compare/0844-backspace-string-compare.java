class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1= new Stack<>();
        Stack<Character> t1= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='#')s1.push(ch);
            else if (!s1.isEmpty()) s1.pop();
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch!='#')t1.push(ch);
            else if (!t1.isEmpty()) t1.pop();
        }
        if(s1.size()!=t1.size()) return false;
        int n = Math.max(s1.size(), t1.size());
        for(int i=0;i<n;i++){
            char tops1=s1.peek();
            char topt1=t1.peek();
            if(tops1==topt1){
                s1.pop();
                t1.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}