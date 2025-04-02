package stringquestions;

public class SubSequenceCheck {
    public static void main(String[] args) {
      String  str = "abc", t = "ahbgdc";
      int index=0;

        for (int i = 0; i < str.length() ; i++) {

            char ch= str.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                char tch= t.charAt(j);
                if(ch==tch){
                    index++;
                }
            }
        }
        if(index == str.length()){
            System.out.println("is a subsequence");
        }else {
            System.out.println("is not a subsequence");
        }
    }
}
