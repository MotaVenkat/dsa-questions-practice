package ArraysQuestions;

import java.util.Arrays;

public class RemoveElementsInArray {
    public static void main(String[] args) {
        int []  nums = {3,2,2,3}; int val = 3;
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!= val){
                nums[j]=nums[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(nums));

        // simple way
        int []  number = {3,2,2,3}; int val1 = 3;
        int [] ans = new int[number.length];
        int k=0;

        for (int i = 0; i <number.length ; i++) {
            if(number[i]!= val1){
                number[k]=nums[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(number));

    }
}
