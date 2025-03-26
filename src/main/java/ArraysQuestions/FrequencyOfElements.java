package ArraysQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class FrequencyOfElements {

    public static void main(String []args){
        int [] a= {1,2,2,5,1,2,6,1,2};
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet <Integer> set= new HashSet<>();

        for (int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                int temp= map.get(a[i]);
                temp++;
                map.put(a[i],temp);

            }else
                map.put(a[i],1);
        }

        for (Integer key: map.keySet()) {
            if(map.get(key) == 1){
                System.out.println("Unique element " +key );
            }

        }

    }
}
