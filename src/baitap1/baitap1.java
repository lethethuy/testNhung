package baitap1;

import java.util.HashMap;
import java.util.Map;

public class baitap1 {
    public static void main(String[] args) {
        // khai bao va khoi tao mang
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3};
        // khoi tao Hashmap de luu tru so lan xuat hien cua tung phan tu
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Duyet qua mang va dem so lan xuat hien cua tung phan tu
        for (int element : arr
        ) {
            if (elementCountMap.containsKey(element)) {
                // neu phan tu da co trong HashMap, tang so lan xuat hien len 1
                int count = elementCountMap.get(element);
                elementCountMap.put(element, count + 1);
            } else {
                elementCountMap.put(element,1);
            }
        }
        // duyet qua cac phan tu trong HashMap va in ra so lan xuat hien cua tung phan tu
        for (Map.Entry<Integer, Integer> enTry : elementCountMap.entrySet()
             ) {
            int element = enTry.getKey();
            int count  = enTry.getValue();
            System.out.println("Phan tu" + element + " lan xuat hien" + count + " lan");
        }

    }

}
