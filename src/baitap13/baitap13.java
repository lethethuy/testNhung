package baitap13;

import java.util.TreeMap;

public class baitap13 {
    public static void main(String[] args) {
        // buoc 1: Khai bao 1 mang cac phan tu so nguyen
        int[] array = {5,4,3,8,1,10};

        // buoc 2: Khai bao 1 doi tuong TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // buoc 3: Them cac phan tu cua mang vao TreeMap

        for (int num:array
             ) {
            treeMap.put(num,0);
        }
        // buoc 4: Lay phan tu nho nhat trong TreeMap
        System.out.println("Phan tu nho nhat trong TreeMap la: "+ treeMap.firstEntry());
    }
}
