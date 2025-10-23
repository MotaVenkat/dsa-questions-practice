package ArraysQuestions;

import java.util.HashSet;

public class TargetSum {

    public static void main(String[] args) {
        int  A[]={3,9,4,6,1,4};
        int k = 8;
        for (int i =0;i<A.length;i++){
            for (int j = 1; j < A.length; j++) {
                if(A[i]+A[j]==k && i!=j){
                    System.out.println("true  "+i+"  " +j);
                }
            }

        }
        /* it does not work as it check the element of A[i] each time it give true even
        though there is only one vlaue
        for (int i=0;i<A.length;i++){
            if(k-A[i]==A[i]){
                System.out.println("true from second functions");
            }

        }*/
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <A.length ; i++) {
            int n= k-A[i];

            if(hs.contains(n)){
                System.out.println("true from has set");

            }
            hs.add(n);
        }

        if(hs.size()!= A.length){
            System.out.println("true from has set");
        }

    }
}
