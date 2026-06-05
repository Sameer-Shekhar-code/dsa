package HashMaps;

import java.util.HashMap;

public class TwoSum {


    public static void main(String[] args) {
        int[] arr=  {2,7,11,15};
        int target = 9;
        int[] num = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            int compliment = target - arr[i];

            if(hashMap.containsKey(compliment)){
                num[0] = i;
                num[1]= hashMap.get(compliment);
            }
            hashMap.put(arr[i], i);
        }

    }
}
