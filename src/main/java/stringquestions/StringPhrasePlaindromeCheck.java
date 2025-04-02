package stringquestions;

public class StringPhrasePlaindromeCheck {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        int s = 0;
        int e = str.length()-1;

        while(s<e){
            char l=str.charAt(s);
            char r= str.charAt(e);
            if(!(Character.isLetterOrDigit(l))){
                s++;
                continue;
            }
            if(!(Character.isLetterOrDigit(r))){
                e--;
                continue;
            }
            char ll =Character.toLowerCase(l);
            char lr =Character.toLowerCase(r);

            if(ll!=lr){
                System.out.println("Not a palindrome");
                return;
            }


            s++;
            e--;
        }
        System.out.println("is a palindrome");

    }

}
