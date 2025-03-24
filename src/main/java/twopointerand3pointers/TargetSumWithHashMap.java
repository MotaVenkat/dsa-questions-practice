package twopointerand3pointers;

import java.util.HashMap;

public class TargetSumWithHashMap {

    public static void main(String[] args) {
        int [] nums = {7, 2, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> hm= new HashMap<>();

        for (int i=0;i< nums.length ; i++){

            int compliment = target-nums[i];
            if(hm.containsKey(compliment)){
                System.out.println("Indices: " + hm.get(compliment) + ", " + i);

            }
            hm.put(nums[i],i);

        }

    }
}
