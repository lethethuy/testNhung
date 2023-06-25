package bai14;

import java.util.Comparator;
import java.util.TreeMap;

public class bai14 {
    public static void main(String[] args) {
        // buoc1: khoi tao TreeMap voi Comparator.reverseOrder()
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());

        // buoc 2: them cac phan tu vao mang

        treeMap.put(5, " Five");
        treeMap.put(10, " Ten");
        treeMap.put(6, " Six");
        treeMap.put(1, " One");
        treeMap.put(8, " eight");
        treeMap.put(2, " two");

        // buoc 3: In ra cac phan tu trong TreeMap
        System.out.println(" Cac phan tu trong TreeMap theo thu tu giam dan cua gia tri:");
        for (int key:treeMap.keySet()
             ) {
            System.out.println(key + ": "+ treeMap.get(key));

        }
    }
}
