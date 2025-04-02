package ArraysQuestions;

import java.util.Arrays;

public class PrefixSumQuires {

    public static void main (String []args){
        int [] a= {3,9,4,-5};
        int [] ps = new int [a.length];
        ps[0]=a[0];

        for (int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];

        }
        System.out.println(Arrays.toString(ps));
    }
}
