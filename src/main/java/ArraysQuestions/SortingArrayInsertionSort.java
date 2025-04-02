package ArraysQuestions;

import java.util.Arrays;

public class SortingArrayInsertionSort {
    public static void main(String[] args) {
        int [] a ={3,4,1,6};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp= a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(a));
    }
}
