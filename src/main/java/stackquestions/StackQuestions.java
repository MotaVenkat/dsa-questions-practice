package stackquestions;

import java.util.Stack;

public class StackQuestions {
    public static void main(String[] args) {
        Stack <Character> st = new Stack<>();
        String str= "abccbc";
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            if(st.size() == 0 || st.peek() != ch){
                st.push(ch);

            }else if(st.peek()==ch){
                st.pop();
            }

        }
        System.out.println(st);
    }
}
