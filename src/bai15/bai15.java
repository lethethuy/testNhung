package bai15;

import java.util.TreeMap;

public class bai15 {
    public static void main(String[] args) {
        // Khoi tao TreeMap va them cac phan tu

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple",5);
        treeMap.put("banana",2);
        treeMap.put("orange",7);
        treeMap.put("grape",4);

        // In ra mang ban dau
        System.out.println("Mang ban dau la: ");
        System.out.println(treeMap);

        // xoa
        treeMap.remove("orange");
        // In TreeMap sau khi xoa
        System.out.println("TreeMap sau khi xoa: ");
        System.out.println(treeMap);


    }
}
