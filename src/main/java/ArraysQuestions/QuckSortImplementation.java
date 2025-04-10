package ArraysQuestions;

import java.util.Arrays;

public class QuckSortImplementation {
    public int[] partitionArray(int [] nums,int lo,int hi){
        //int [] nums = {2,5,3,1,6,6,8,9,7};
        int n= nums.length;
        int pi=nums[n-1];
        int i=0;
        int j=0;

        while(j<n){
            if (nums[j] >=pi) {
                j++;
            }else{
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
        }
        int temp=nums[i];
        nums[i]=nums[n-1];
        nums[n-1]=temp;
        System.out.println(Arrays.toString(nums));

        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,3,1,6,6,8,9,7};
        int pi= nums[nums.length-1];
        int lo=0;
        int hi=nums.length-1 ;


    }

}
