package prefixsumrelated;

import java.util.Arrays;

public class ContineousSumQuery {
    public static void main(String[] args) {
        int [] a = {0,0,0,0,0,0,0,0,0};
        int [][]q= {{3,6,1},{2,7,3},{4,6,5},{1,5,-4}};
        int []ans = solve(a,q);

        System.out.println(Arrays.toString(ans));

    }

   static int[] solve(int[] a, int[][] q) {
        //int []diff = new int[a.length+1];
        for (int i = 0; i <q.length ; i++) {
            int  s =q[i][0];
            int e= q[i][1];
            int val=q[i][2];
            a[s]+=val;
            if(e+1<a.length){
                a[e+1]-=val;
            }

        }
        int []pfxsum =new int [a.length];
        pfxsum[0]=a[0];
        for(int i=1;i<a.length;i++){
            pfxsum[i]=pfxsum[i-1]+a[i];
        }


        return pfxsum;
    }
}
