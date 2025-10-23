package ArraysQuestions;

import java.util.HashSet;

public class TargetSubarraySum {
    public static void main(String[] args) {
        int []A= {2,-3,-1,6,5,4};
        int k=10;
        int sum=0;

        HashSet<Integer> hs= new HashSet<>();
        hs.add(0);

        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
            int x= sum-k;
            if(hs.contains(x)){
                System.out.println("true");
            }
            hs.add(sum);
        }

    }
}
