package twopointerand3pointers;

public class TargetSum {

    public static void main(String[] args) {
        //Approch 1
        // array is sorted in ascending order
        int a [] = {2,7,9,15,16};
        int target = 9;
        int i=0;
        int j = a.length-1;
        int sum =0;

        while (i<j){
            sum = a[i]+a[j];
            if(sum == target){
               System.out.println("Targetd element is there at the indices "+i +" " +j );
                i++;
                j--;
            } else if (sum > target) {
                j--;

            }else {
                i++;
            }

        }


        // approch 2
        // unsorted array using two for loops
        // works for both sorted and unsorted using two for loops
        int [] arr = {1, 2, 3, 5, 7, 9};
        int targetsum = 10;
        int tarsum =0;
        //int n = arr.length;
        for(int l =0;l<arr.length;l++){
            for (int m =l+1 ;m < arr.length;m++){
                tarsum = arr[l]+arr[m];
                if(tarsum==targetsum){
                    System.out.println("Target sum found at the indices " +l+" "+m);
                }
            }
        }
        System.out.println("No pair found for the taget element ");

    }
}
