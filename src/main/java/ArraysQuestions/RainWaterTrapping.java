package ArraysQuestions;

import java.util.Arrays;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int [] a= {2,1,3,2,1,2,4,3,2,1,3,1};
        int []pfm = new int[a.length];
        pfm[0]=a[0];
        for (int i = 1; i < a.length ; i++) {
            pfm[i]=Math.max(a[i],pfm[i-1]);


        }
        System.out.println("prefix max "+Arrays.toString(pfm));
        int sfm[]= new int[a.length];
        sfm[a.length-1]=a[a.length-1];
        for (int i = a.length-2; i >=0 ; i--) {
            sfm[i]=Math.max(a[i],sfm[i+1]);
        }
        System.out.println("Sufix max "+Arrays.toString(sfm));

        int ans=0;
        for (int i = 1; i <a.length-1 ; i++) {
            int lb= pfm[i-1];
            int rb=sfm[i+1];
           int   amnt =Math.min(lb,rb) -a[i];
           if(amnt>0){
               ans+=amnt;
           }
        }
        System.out.println("total amount of water trapped " +ans);

    }
}
