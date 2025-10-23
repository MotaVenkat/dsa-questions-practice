package ArraysQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementsInArray   {
    public static void main(String[] args) {
        int []a= {2,4,3,8,3,9,4,9};
        int k=4;
        int s=1;
        int e= k;

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(i,a[i]);

        }
        System.out.println(hs.size());
        for(int i=s;e<a.length;i++){
            hm.add(a[i]);


        }
    }

}
