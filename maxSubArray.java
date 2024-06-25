package cpPractice;

import java.util.Arrays;
import java.util.HashMap;

public class maxSubArray {
    public static void main(String[] args) {
        int arr[]={55,21,55,21,69,21};

        HashMap<Integer,Integer> mapp=new HashMap<>();

        for (int i : arr) {
            if (mapp.containsKey(i)) {
                mapp.put(i,mapp.get(i)+1);
            }
            else{
                mapp.put(i, 1);
            }
        }

        for(int key:mapp.keySet()){
            System.out.println(key+"->"+mapp.get(key));
        }

        
    }
}

