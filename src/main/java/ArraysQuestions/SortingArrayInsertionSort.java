package ArraysQuestions;

import java.util.Arrays;

public class SortingArrayInsertionSort {
    public static void main(String[] args) {
        int [] a ={3,4,1,6};
        for (int i = 1; i <a.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if(a[j] < a[j-1]){
                    int temp= a[j];
                     a[j]=a[j-1];
                     a[j-1]=temp;

                }
            }

        }


        System.out.println(Arrays.toString(a));
    }
}
