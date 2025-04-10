package hashmaprelaredquetions;

import java.util.HashMap;

public class NearByDuplicate {
    public static void main(String[] args) {
        int []nums={1,2,3,1};
        int n=nums.length;
        int k=3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<n ;i++){

            if(hm.containsKey(nums[i])){
                int lastindex=hm.get(nums[i]);

                if((i-lastindex) <= k){
                    System.out.println("found the element");

                }

            }
                hm.put(nums[i],i);


        }
        System.out.println(hm.toString());
    }
}
