package SortArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] massive = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};

        for (int e:massive){
            arrayList.add(e);
        }

        Map<Integer,Integer> sorter = new HashMap<>();

        for (int e: arrayList){
            int newValue = sorter.getOrDefault(e,0)+1;
            sorter.put(e,newValue);
        }

        System.out.println(sorter);

    }
}
