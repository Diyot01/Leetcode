class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int len = operations.length;
        for(int i=0;i<len;i++){
            String s= operations[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")){
                int num=st.peek()*2;
                st.push(num);
            }else if(s.equals("+")){
                int top1=st.pop();
                int top2=st.peek();
                int num=top1+top2;
                st.push(top1);
                st.push(num);
            }else{
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }
        int sum=0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}