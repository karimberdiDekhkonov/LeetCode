package org.example.hard;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class HouseDestruction {

    public static int[] countHouseSegments(int[] houses, int[] queries){
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int house : houses) {
            treeSet.add(house);
        }

        int segments = countSegments(treeSet);

        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int houseToRemove = queries[i];

            Integer leftHouse = treeSet.lower(houseToRemove);
            Integer rightHouse = treeSet.higher(houseToRemove);

            treeSet.remove(houseToRemove);

            if (leftHouse != null && rightHouse != null){
                if (rightHouse - leftHouse > 1){
                    segments--;
                }
            }
            else if (leftHouse != null || rightHouse != null){
                segments--;
            }


            arr[i] = segments;
        }


        return arr;
    }

    private static int countSegments(TreeSet<Integer> treeSet) {
        if (treeSet.isEmpty()) return 0;
        int segments = 1;

        Iterator<Integer> iterator = treeSet.iterator();

        int prev = iterator.next();

        while (iterator.hasNext()){
            int cur = iterator.next();
            if (cur-prev > 1){
                segments++;
            }

            prev=cur;
        }

        return segments;
    }


    public static void main(String[] args){
        int[] houses = {1, 3, 5, 7, 9};
        int[] queries = {3, 5, 1};

        int[] result = countHouseSegments(houses, queries);

        // Output the number of segments after each query
        System.out.println(Arrays.toString(result)); // Expected output: [4, 3, 2]
    }

}
