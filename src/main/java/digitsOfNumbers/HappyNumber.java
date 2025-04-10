package digitsOfNumbers;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        HashSet<Integer> hs = new HashSet<>();
        int sum =0;
        while(n == 1 ){
            int ld= n%10;
            n=n/10;
            sum = sum +(ld*ld);
            if (hs.contains(sum)) {
                System.out.println("Not a happy number");
            }
            hs.add(sum);


        }

    }
}
