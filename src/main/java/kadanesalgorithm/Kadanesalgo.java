package kadanesalgorithm;

public class Kadanesalgo {
    public static void main(String[] args) {
        //maximum sum subarray with Kadanes algorithm
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum=A[0];
        int ans=A[0];
        for (int i = 1; i < A.length ; i++) {


            sum = Math.max(A[i], sum + A[i]);

            // update global max
            ans = Math.max(ans, sum);

        }
        System.out.println(ans);
    }
}
