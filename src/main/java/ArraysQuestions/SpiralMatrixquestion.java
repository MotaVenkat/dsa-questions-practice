package ArraysQuestions;

import org.w3c.dom.ls.LSOutput;

public class SpiralMatrixquestion {
    public static void main(String[] args) {
        int [][]s={{1,2,3},{4,5,6},{7,8,9}};
        int i = 0;
        int j = 0;
        int n = s.length;
        while(n > 1) {

            for (int k = 0; k < n - 1; k++) {
                System.out.println(s[i][j]);
                j++;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.println(s[i][j]);
                i++;
            }

            for (int k = 0; k < n - 1; k++) {
                System.out.println(s[i][j]);
                j--;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.println(s[i][j]);
                i--;
            }
            i++;
            j++;
            n-=2;
        }
        if(n==1){
            System.out.println(s[i][j]);
        }
    }


}
