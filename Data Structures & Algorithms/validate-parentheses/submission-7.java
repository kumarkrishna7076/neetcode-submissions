class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();

        if (arr[0] == '}' || arr[0] == ')' || arr[0] == ']')
            return false;
        for (char c : arr) {
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else if (!st.isEmpty()) {
                if ((c == ']' && st.peek() != '[') || 
                   (c == '}' && st.peek() != '{') || 
                   (c == ')' && st.peek() != '(')) {
                        return false;
                    }
                else {
                    st.pop();
                }
            } else {
                return false;
            }
        }

        return st.empty();
    }
}
