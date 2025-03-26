package ArraysQuestions;

import java.util.Arrays;

public class RotateArray {

    static void rotateArray(int s,int e,int [] a){
        while(s<e){
            int temp = a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }


    }

    public static void main(String[] args) {
        int [] a= {10,20,30,40,50};
        int k=3;
        k=k%a.length;

        rotateArray(0,a.length-1,a);
        rotateArray(0,k-1,a);
        rotateArray(k,a.length-1,a);



        System.out.println(Arrays.toString(a));
    }
}
