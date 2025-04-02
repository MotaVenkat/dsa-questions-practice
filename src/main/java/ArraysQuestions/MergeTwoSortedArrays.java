package ArraysQuestions;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,5,6};
        int [] temp = new int[nums1.length + nums2.length];
        int j=0;
        int i=0;
        int k= 0;
        while (i < nums1.length && j< nums2.length){

            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                k++;
                i++;
            }else
            {
                temp[k] = nums2[j];
                k++;
                j++;
            }

            System.out.println("hi from while loop");

        }
        while (i< nums1.length){
            temp[k]=nums1[i];
            k++;
            i++;
        }
        while (j< nums2.length){
            temp[k]=nums2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
