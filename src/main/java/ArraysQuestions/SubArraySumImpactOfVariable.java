package ArraysQuestions;

import java.util.Arrays;

public class SubArraySumImpactOfVariable {
    public static void main(String[] args) {
        int [] a = {0,0,0,0,0,0,0,0,0,0};
        int [][]q={{3,6,1},{2,7,3},{4,6,5},{1,5,-4}};

        for (int i = 0; i <q.length ; i++) {
            int s= q[i][0];
            int e=q[i][1];
            int val= q[i][2];

            for (int j = s; j <=e ; j++) {

                a[j]+=val;
            }

        }
        System.out.println(Arrays.toString(a));

    }

}
