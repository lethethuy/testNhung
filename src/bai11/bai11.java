package bai11;

import java.util.Arrays;
import java.util.TreeMap;

public class bai11 {
    public static void main(String[] args) {
        //buoc 1: khai bao va khoi tao 1 mang so nguyen

        int[] array = {5, 10, 2, 8, 3};

        // buoc 2: khai bao 1 doi tuong tree map
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // buoc 3: Them cac phan tu cua mang vao TreeMap
        for (int num:array
             ) {
            treeMap.put(num,0);
        }
        System.out.println("Mang ban dau: "+ Arrays.toString(array));
        System.out.println("Mang sau khi da sap xep: "+ treeMap);
    }
}