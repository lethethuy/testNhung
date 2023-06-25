package bai12;

import java.util.Arrays;
import java.util.TreeMap;

public class baitap12 {
    public static void main(String[] args) {
        // khai bao va khoi tao 1 mang so nguyen
        int[] array = {5,10,9,2,3};
        // buoc 2: Khai bao 1 doi tuong treemap
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        // buoc3: Them cac phan tu vao mang TreeMap
        for (int num :array
             ) {
            treeMap.put(num,0); // num la khoa key, 0 la gia tri value tuong ung
        }
        // buoc 4: lay gia tri cua phan tu lon nhat trong TreeMap
         int largestElement = treeMap.lastKey();
//        System.out.println(largestElement);
//        System.out.println(treeMap);
        // buoc5: xoa phan tu lon nhat khoi tree map
        treeMap.remove(largestElement);
        // buoc6: Lay phan tu lon thu 2
        int seconLargestElement = treeMap.lastKey();

        // In ket qua:

        System.out.println("Mang ban dau : "+ Arrays.toString(array));
        System.out.println("Phan tu lon thu 2 trong mang la: " + seconLargestElement);



    }
}
