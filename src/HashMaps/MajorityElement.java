package HashMaps;

//Given an array arr[] consisting of n integers, the task is to find all the array elements which occurs more than floor(n/3) times.
//
//Note: The returned array of majority elements should be sorted.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {

    public static ArrayList<Integer> Major(int[] arr,int n){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0 ; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i])+1);
            }
            else {
                h.put(arr[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int key: h.keySet() ){
            if( h.get(key)> n){
                list.add(key);
            }
        }


        return list;
    }
    public static void main(String[] args) {
        int a[] = { 2, 2, 3, 1, 3, 2, 1, 1};
        int n = a.length / 3;
        System.out.println(Major(a, n));
    }
}
