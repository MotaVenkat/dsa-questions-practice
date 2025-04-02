package ArraysQuestions;

import java.util.Arrays;

public class SubQuirySumWithPrefixSum {
    public static void main(String[] args) {
        int []a= {2,4,1,3,0};
        int [][] q= {{0,3},{1,4}};

        int []ps = new int[a.length];
        ps[0]=a[0];
        for(int i =1;i < a.length;i++){
            ps[i]=ps[i-1]+a[i];
        }
        System.out.println(Arrays.toString(ps));
        for (int i=0;i<q.length;i++){
            int l=q[i][0];
            int h=q[i][1];

            if(l==0){
                System.out.println("Sub quiry sum " +ps[h] );
            }else{
                System.out.println("Sub quiry sum " +(ps[h]-ps[l-1]));
            }
        }
    }
}
