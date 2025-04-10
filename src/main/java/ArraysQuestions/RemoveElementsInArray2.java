package ArraysQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveElementsInArray2 {
    public static void main(String[] args) {
        int []  nums = {1,1,1,2,2,3};
        int j=0;

        for (int i = 0; i <nums.length; i++) {
            if(j<   2 || nums[i]!=nums[j-2]){

                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));



    }
}
